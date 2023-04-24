package day18_NestedLoops;

import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
        System.out.println("First number:");
        int n1= sc.nextInt();
        System.out.println("Second number:");
        int n2= sc.nextInt();
        System.out.println("Addition: "+(n1+n2));
        System.out.println("Would you like to continue?");
        String a= sc.next().toLowerCase();
        while(!(a.equals("yes")||a.equals("no"))){
            System.err.println("Invalid entry");
            System.out.println("Would you like to continue?");
            a= sc.next().toLowerCase();
        }
        if(a.equals("no"))
            break;


    }
} }
