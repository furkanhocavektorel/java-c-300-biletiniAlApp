import controller.UserController;
import db.Database;
import entity.User;

public class Runner {

    // FRONT_END sim


    public static void main(String[] args) {

        System.out.println("mail giriniz");
        String mail= "ali@gmail.com";

        System.out.println("şifre");
        String sifre= "asd123asd";

        UserController userController=new UserController();
        boolean isSuccess=userController.register(mail,sifre);

        if (isSuccess){
            System.out.println("kayit basarili");
        }else {
            System.out.println("kayit basarisiz");
        }



    }


}
