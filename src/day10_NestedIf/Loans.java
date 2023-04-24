package day10_NestedIf;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary= sc.nextInt();
        System.out.println("Enter the credit score");
        int score= sc.nextInt();
        String result="";
        result=salary>60000&&score>650?"Loan Approved":"Loan Denied";
        System.out.println("result = " + result);
    }
}
