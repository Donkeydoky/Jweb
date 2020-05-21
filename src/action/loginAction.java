package action;

public class loginAction {

        private String username;
        private String password;
        private String msg = "login error!";

        public String execute() throws Exception {
            System.out.println("username = "+username+"password = "+password);
            if (username.equals("admin") && password.equals("123")) {
                msg = "login success!";
            }
            return "success";
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
