
import company.model.Gender;
import company.model.User;
import company.service.impl.MyException;
import company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) throws MyException {

        User user1 = new User(1, "Nurisa", 20, Gender.FEMALE);
        User user2 = new User(2, "Malika", 17,Gender.FEMALE);
        User user3 = new User(3, "Asan", 24,Gender.MALE);

        UserServiceImpl userService = new UserServiceImpl();
        userService.addUsers(user1);
        userService.addUsers(user2);
        userService.addUsers(user3);
        userService.getAllUsers();

        System.out.println("------------------------------------------------------");

        try {
            userService.findById(2);
            userService.deleteById(5);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
       userService.getAllUsers();

        }
    }