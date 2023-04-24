package day19_LoopPractice;

import java.util.Scanner;

public class Task3Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter the length of the rectangle:");
        int len= sc.nextInt();
        if(len<=0){
            System.err.println("Invalid Entry for the length of the rectangle");
            System.exit(0);
        }
        System.out.println("Enter the width of the rectangle:");
        int wid=sc.nextInt();
        if (wid<=0){
            System.err.println("Invalid Entry for the length of the rectangle");
            System.exit(0);
        }
        System.out.println("Area: "+len*wid);
        System.out.println("Perimeter: "+2*(len+wid));

        System.out.println("Would you like to calculate another rectangle?");
        String a= sc.next().toLowerCase();

        while(!(a.equals("yes")||a.equals("no"))){
            System.err.println("Invalid entry. Please re-enter:");
            a=sc.next().toLowerCase();
        }
        if(a.equals("no")){
            System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
            break;
        }
    }
}}
