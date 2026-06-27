package repository;

import db.Database;
import entity.User;

public class UserRepository {

    public void createUser(User user){
        // Doğrudan static listeye ulaşıp ekleme yapıyoruz
        Database.userDB.add(user);
    }
}