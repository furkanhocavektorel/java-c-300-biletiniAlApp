package service;

import entity.User;

public interface IUserService {


    boolean register(String email,String password);
    User login(String email,String password);
    public User findUserByID(Long ID);

    void updateName(Long id, String yeniAd);
}
