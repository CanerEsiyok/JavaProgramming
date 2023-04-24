package day25_CustomMethod_Overloading;

import java.util.Scanner;

public class SumOfNumbers {
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println(sum(a,b));
    }
}
