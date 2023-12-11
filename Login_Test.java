package oops;


import java.util.*;

class Login{

    Scanner sc;

    String user,pass;

    public Login(Scanner sc) {

        this.sc=sc;

        insertData();

    }

    public void insertData() {

        System.out.println("Enter UserName: ");

        user=sc.nextLine();

        System.out.println("Enter Passward: ");

        pass=sc.nextLine();

        validation();

    }

    public void validation() {

        if(user.equals("admin")) {

            if(pass.equals("admin")) {

                System.out.println("Successfully Login Welcome Admin..");

            }else {

                System.out.println("Wrong Password please try again!");

            }

        }else {

            System.out.println("Wrong Username please try again!");

        }

    }

}

public class Login_Test {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Login l=new Login(sc);

    }

}