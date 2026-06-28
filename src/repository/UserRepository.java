package repository;

import db.Database;
import entity.User;

public class UserRepository implements IUserRepository {

    @Override
    public void createUser(User user){
        Database.userDB.add(user);
    }

    @Override
    public User findUserByEmail(String email){

        // metoda gelen email ile herhangi bir elemanda ki mail aynı mı?
        // aynı ise o user'ı dönmem lazım aynı değil ise null dönmem lazım

        for (int i=0; i<=Database.userDB.size()-1 ; i++){

            if (Database.userDB.get(i).getEmail().equals(email)){
                User user=Database.userDB.get(i);
                return user;
            }

        }

        return null;
    }


    public User findUserByID (Long ID){
        for (int i=0; i<=Database.userDB.size()-1 ; i++){

            if (Database.userDB.get(i).getId().equals(ID)){
                User user=Database.userDB.get(i);
                return user;
            }

        }

        return null;

    }

    @Override
    public void updateName(User user) {
        // ODEV Eski kullanıcıyı silmeden
        // sadece adını güncellemek istiyorum.
        Database.userDB.remove(findUserByID(user.getId()));
        Database.userDB.add(user);
    }


}