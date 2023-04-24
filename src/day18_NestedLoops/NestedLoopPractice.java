package day18_NestedLoops;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter your age:");
        int age= sc.nextInt();
        while(!(age>=1&&age<=120)){
            System.err.println("Invalid age, please re-enter:");
            age= sc.nextInt();}

        System.out.println("Would you like to continue?");
        String a= sc.next();
        while(!(a.equals("yes")|| a.equals("no"))){
            System.err.println("Invalid entry, please re-enter:");
            a= sc.next();
        }
        if(a.equals("no"))
            break;

    }
}}
