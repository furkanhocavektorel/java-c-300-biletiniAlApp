package repository;

import db.Database;
import entity.User;

public interface IUserRepository {


    void createUser(User user);


    User findUserByEmail(String email);


    public User findUserByID (Long ID);


    void updateName(User user);
}
