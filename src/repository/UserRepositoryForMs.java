package repository;

import db.Database;
import db.MsDatabase;
import entity.User;

public class UserRepositoryForMs implements IUserRepository {

    @Override
    public void createUser(User user){
        MsDatabase.userDB.add(user);
    }

    @Override
    public User findUserByEmail(String email){

        // metoda gelen email ile herhangi bir elemanda ki mail aynı mı?
        // aynı ise o user'ı dönmem lazım aynı değil ise null dönmem lazım

        for (int i=0; i<=Database.userDB.size()-1 ; i++){

            if (MsDatabase.userDB.get(i).getEmail().equals(email)){
                User user=Database.userDB.get(i);
                return user;
            }

        }

        return null;
    }

}
