package controller;

import service.UserService;

public class UserController {


    public boolean register(String mail,String password){

        UserService userService= new UserService();

        boolean isSuccess= userService.register(mail,password);
        return isSuccess;
    }



}
