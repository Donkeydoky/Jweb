package service;

import entity.User;

public class UserService {

    public void login(User user){
        if(!user.getUsername().equals("admin")||!user.getPassword().equals("123")){
            throw new UserNotFoundException("User name or password not right!");
        }
    }
}
