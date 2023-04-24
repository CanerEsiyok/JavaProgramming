package day18_NestedLoops;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int attempt=2;
        System.out.println("username:");
        String name=sc.next();
        System.out.println("password:");
        String pass= sc.next();

        if (name.equals("Cydeo")&& pass.equals("WoodenSpoon"))
            System.out.println("Logged in");
        else { while (attempt>0) {
            System.err.println("Incorrect username or password");
            System.out.println("username:");
            name=sc.next();
            System.out.println("password:");
            pass= sc.next();
            if (name.equals("Cydeo")&& pass.equals("WoodenSpoon")){
                System.out.println("Logged in");
                break;}
            attempt--;
        } if(attempt==0)
            System.err.println("Account blocked");

        }

    }
}
