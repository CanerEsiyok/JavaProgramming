package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Username:");
        String name=sc.nextLine();
        System.out.println("Password:");
        String pass=sc.nextLine();
        int attempt=1;
        while( !(name.equals("Cydeo") && pass.equals("Cydeo123")) && attempt<3){

            System.err.println("Wrong input, try again:");
            if(attempt==2)
                System.err.println("It is your last chance");
            System.out.println("Username:");
            name=sc.nextLine();
            System.out.println("Password:");
            pass=sc.nextLine();
            attempt++;



        } if(name.equals("Cydeo") && pass.equals("Cydeo123"))
            System.out.println("Login successful");
        else System.err.println("Access blocked");



    }
}
