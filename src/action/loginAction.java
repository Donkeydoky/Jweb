package action;

import entity.User;

public class loginAction {

    private User user;

    private String msg = "login error!";

    public String execute() throws Exception {
        System.out.println("username = "+user.getUsername()+"password = "+user.getPassword());
        if (user.getUsername().equals("admin") && user.getPassword().equals("123")) {
                msg = "login success!";
        }
        return "success";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
