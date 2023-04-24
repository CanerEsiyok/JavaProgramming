package day19_LoopPractice;

import java.util.Scanner;

public class Task2Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter the side of the square:");
        int side= sc.nextInt();
        if(side<=0){
            System.err.println("Invalid entry for the side of the square");
            System.exit(0);
        }
        System.out.println("Area of Square: "+(side*side));
        System.out.println("Perimeter of Square: "+(4*side));

        System.out.println("Would you like to calculate another square?");
        String a= sc.next();
        while(!(a.equals("yes")||a.equals("no"))){
            System.err.println("Invalid entry. Please re-enter:");
            a= sc.next();
        }
        if (a.equals("no")){
            System.out.println("Thanks for using Cydeo Square Calculator App");
            break;
        }
    }}
}
