package day11_SwitchScanner;

import java.util.Scanner;

public class BiggerNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1= sc.nextInt();
        System.out.println("Enter the second number");
        int n2= sc.nextInt();
        System.out.println("Enter the third number");
        int n3= sc.nextInt();
        String result;
        result=n1>n2&&n1>n3?n1+ "is the bigger":n2>n1&&n2>n3?n2 +" is bigger":n3 +" is bigger";
        System.out.println(result);
    }
}
