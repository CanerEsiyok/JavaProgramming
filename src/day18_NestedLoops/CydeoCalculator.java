package day18_NestedLoops;

import java.util.Scanner;

public class CydeoCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("First number:");
        int n1= sc.nextInt();
        System.out.println("Math operator:");
        char op=sc.next().charAt(0);
        while (!(op=='+'||op=='-'||op=='*'||op=='/')){
            System.err.println("Invalid operator. Please re-enter:");
            op=sc.next().charAt(0);
        }
        System.out.println("Second number:");
        int n2= sc.nextInt();
        double result=0;
        if(op=='+')
            result=n1+n2;
        else if(op=='-')
            result=n1-n2;
        else if(op=='*')
            result=n1*n2;
        else
            result=n1/n2;
            System.out.println("result = " + result);
        System.out.println("Do you want to continue?");
        String a= sc.next();
        while(!(a.equals("yes")||a.equals("no"))){
            System.err.println("Invalid entry. Please re-enter:");
            a= sc.next();
        }
        if(a.equals("no"))
            break;


    }
}}
