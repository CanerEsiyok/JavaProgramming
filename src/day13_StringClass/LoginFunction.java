package day13_StringClass;

import java.util.Scanner;

public class LoginFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("username:");
        String username=sc.next();
        System.out.println("password:");
        String password=sc.next();
        if(username.equals("Cydeo")&&password.equals("WoodenSpoon"))
            System.out.println("Logged in");
        else System.out.println("Incorrect username or password");
    }
}
