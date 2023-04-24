package day23_VoidMethod;

import java.util.Scanner;

public class Task15 {
    public static void math(int a, int b, char op) {
        if(op=='+')
            System.out.println(a+b);
        else if(op=='-')
            System.out.println(a-b);
        else if (op=='*') {
            System.out.println(a*b);
        }
        else System.out.println((double) a/b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First number:");
        int a= sc.nextInt();
        System.out.println("Second number:");
        int b= sc.nextInt();

            System.out.println("Enter a math op:");
            char op=sc.next().charAt(0);




        math(a,b,op);
    }
}
