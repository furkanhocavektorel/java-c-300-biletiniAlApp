package service;

import entity.User;
import repository.IUserRepository;
import repository.UserRepository;

public class UserService implements IUserService{

    IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @Override
    public boolean register(String email,String password){
        User user= new User();
        user.setId(3242345L);
        user.setEmail(email);
        user.setPassword(password);

        userRepository.createUser(user);
        return true;
    }

    @Override
    public User login(String email,String password){

        User user=userRepository.findUserByEmail(email);

        if (user==null){
            return null;
        }

        if (!user.getPassword().equals(password)){
            return null;
        }

        return user;

    }




}
