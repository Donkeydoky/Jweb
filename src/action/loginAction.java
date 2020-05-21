package action;

import com.opensymphony.xwork2.ModelDriven;
import entity.User;
import service.UserNotFoundException;
import service.UserService;

public class loginAction implements ModelDriven<User> {

    private User user = new User();
    private UserService userService = new UserService();
    private String msg = "login success!";

    public String login() throws Exception {

        //catch the error with UserNotFoundException.
        //e.printStackTrace can print out the exception into log,
        //in order to prevent the attacts (brutal force password cracker).
        //dont handle the username and password error separately as it
        //can lead to guessing username or password in the database.
        try {
            userService.login(user);
        }catch (UserNotFoundException e){
            msg = e.getMessage();
            e.printStackTrace();
        }
        return "success";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {this.user = user;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public User getModel() {
        return user;
    }
}
