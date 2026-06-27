package service;

import entity.User;
import repository.UserRepository;

public class UserService {


    public boolean register(String mail,String password){
        User user= new User();
        user.setId(3242345L);
        user.setEmail(mail);
        user.setPassword(password);

        UserRepository userRepository= new UserRepository();
        userRepository.createUser(user);
        return true;
    }


}
