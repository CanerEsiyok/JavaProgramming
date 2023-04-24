package day17_While_DoWhile;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number 1:");
        int n1= sc.nextInt();
        System.out.println("Number 2:");
        int n2=sc.nextInt();
        System.out.println("Operator:");
        char op=sc.next().charAt(0);
        while(!(op=='+' || op=='-' || op=='*' || op=='/')){
            System.err.println("Invalid operator, please re-enter:");

            op=sc.next().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/')
             break;

    }  double result=op=='+'?n1+n2:op=='*'?n1*n2:op=='-'?n1-n2:n1/n2;
        System.out.println(result);
}}
