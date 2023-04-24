package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First number:");
        int n1= sc.nextInt();
        System.out.println("Second number:");
        int n2= sc.nextInt();
        System.out.println("Math operator:");
        char op= sc.next().charAt(0);

        while(!(op=='+'||op=='-')){
            System.err.println("Invalid operator, Please re-enter:");
            op= sc.next().charAt(0); }

        int result=op=='+'?n1+n2:n1-n2;
        System.out.println(result);


        }

    }

