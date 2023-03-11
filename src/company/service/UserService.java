package company.service;

import company.model.User;
import company.service.impl.MyException;

public interface UserService {
    void addUsers(User user1);
    User findById(int id) throws MyException;
    void deleteById(int id) throws MyException;
    void getAllUsers();


}
