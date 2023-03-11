package company.service.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDao();


    @Override
    public void addUsers(User user1) {
        userDao.getUsers().add(user1);
    }


    @Override
    public User findById(int id) throws MyException {
        for (User user : userDao.getUsers()) {
            if (user.getId() == id) {
                return user;
            }

        }
        throw new MyException("Id not found" + id);
    }

    @Override
    public void deleteById(int id) {
        int counter = 0;

        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id) {
                userDao.getUsers().remove(userDao.getUsers().get(i));
            } else {
                counter++;
            }
        }
        if (counter == userDao.getUsers().size()) {
            throw new MyException("Id not found" + id);
        }
    }
    
    @Override
    public void getAllUsers() {
        for (User user : userDao.getUsers()) {
            System.out.println(user);
        }
    }
}




