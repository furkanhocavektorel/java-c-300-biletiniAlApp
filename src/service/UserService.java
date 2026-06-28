package service;

import entity.User;
import enums.ERole;
import repository.IUserRepository;
import repository.UserRepository;

import java.util.Random;

public class UserService implements IUserService{

    IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @Override
    public boolean register(String email,String password){
        User user= new User();

        Random rnd= new Random();
        user.setId(rnd.nextLong());

        user.setEmail(email);
        user.setPassword(password);
        user.setRole(ERole.CUSTOMER);

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

    public User findUserByID(Long ID){
        return userRepository.findUserByID(ID);
    }

    @Override
    public void updateName(Long id, String yeniAd) {
        User user= findUserByID(id);
        user.setName(yeniAd);
        userRepository.updateName(user);
    }


}
