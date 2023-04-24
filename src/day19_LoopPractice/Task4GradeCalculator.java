package day19_LoopPractice;

import java.util.Scanner;

public class Task4GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter your score:");
        int score=sc.nextInt();
        if(!(score>=0&&score<=100)){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        String result=score>=90?"A":score>=80?"B":score>=70?"C":score>=60?"D":"F";
            System.out.println(result);
        System.out.println("Would you like to continue?");
        String a= sc.next().toLowerCase();
        if(!(a.equals("yes")||a.equals("no"))){
            System.err.println("Invalid entry");
           // System.exit(0);
            break;
        }
        else if(a.equals("no")){
            System.out.println("Thank you for using Cydeo Grade Calculator APP");
            System.exit(0);
        }
    }}}
