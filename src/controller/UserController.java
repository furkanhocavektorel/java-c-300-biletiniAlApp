package controller;

import entity.User;
import service.IUserService;

public class UserController {

    IUserService userService;

    public UserController(IUserService userService){
        this.userService=userService;
    }

    // DI
    public boolean register(String mail, String password) {
        boolean isSuccess = userService.register(mail, password);
        return isSuccess;
    }

    public User login(String email, String password) {
        return userService.login(email, password);
    }

    public User getUserByID (Long ID){
        return userService.findUserByID(ID);
    }

    public void updateName(Long id, String yeniAd) {
        userService.updateName(id,yeniAd);
    }
}
