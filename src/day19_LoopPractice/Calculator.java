package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First Number:");
        int n1= sc.nextInt();
        System.out.println("Math operator:");
        char op=sc.next().charAt(0);
        if(! (op=='+' || op=='-')) {
            System.err.println("Invalid math operator: "+op);
            System.exit(0); }

        System.out.println("Second number:");
        int n2=sc.nextInt();

        if(op=='+')
            System.out.println(n1-n2);
        else
            System.out.println(n1+n2);
    }
}
