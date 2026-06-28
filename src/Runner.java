import controller.UserController;
import db.Database;
import entity.User;
import repository.UserRepository;
import repository.UserRepositoryForMs;
import service.UserService;

import java.util.Scanner;

public class Runner {
    static UserController userController= new UserController(new UserService(new UserRepository()));
    static Scanner src= new Scanner(System.in);
    // FRONT_END sim



    static User user;


    public static void main(String[] args) {


        registerAll();
        while (true){

            System.out.println("1_login 2_register");
            int secim= src.nextInt();
            switch (secim){
                case 1:
                    login();
                if (user!=null){
                    menu();
                }

                case 2: register();
                default:
                    System.out.println("yanlis secim");
            }

        }




    }

    static void registerAll(){
        userController.register("furkan@gmail.com","asd123");
        userController.register("alikoc@gmail.com","fenerbahce");
        userController.register("dursun@gmail.com","DursunBaskan");

    }

    static void login(){
        src.nextLine();
        System.out.println("email girinz");
        String email= src.nextLine();

        System.out.println("sifre giriniz");
        String sifre= src.nextLine();

        User loginUser=userController.login(email,sifre);

        if (loginUser==null){
            System.out.println("kullanici adi veya sifre hatali");
        }else {
            user=loginUser;

        }


    }

    static void register(){
        System.out.println("email girinz");
        String email= src.nextLine();

        System.out.println("sifre giriniz");
        String sifre= src.nextLine();

        userController.register(email,sifre);

    }

    static void menu(){

        while (true){
            System.out.println("1_ad degister\n2_soyad degister"+
                    "\n0_cikis yap");
            int secim=src.nextInt();

            switch (secim){
                case 1: adDegistir();
                break;
                case 2: soyadDegistir();
                break;
                case 3: profilimiGoster();
                break;
                case 0: break;
                default:
                    System.out.println("yanlis secim");
            }

        }

    }


    static void adDegistir(){
        src.nextLine();
        System.out.println("eski adınız : "+ user.getName());
        System.out.println("adınızı giriniz");
        String yeniAd= src.nextLine();
        user.setName(yeniAd);

        userController.updateName(user.getId(),yeniAd);
    }

    static void soyadDegistir(){
        src.nextLine();
        System.out.println("soyadınızı giriniz");
        String yeniSoyad = src.nextLine();
        user.setSurname(yeniSoyad);

    }

    static void profilimiGoster(){
        User myUser = userController.getUserByID(user.getId());
        System.out.println(myUser.getId());
        System.out.println(myUser.getName());
        System.out.println(myUser.getSurname());
        System.out.println(myUser.getPhone());

    }











}

















