package day23_VoidMethod;

import java.util.Scanner;

public class WithParameters {
    public static void oddOrEven(int n){
        if(n%2==0)
            System.out.println(n+" is an even number");
        else
            System.out.println(n+" is an odd number");
    }
    public static void age(int year){
        int age=2022-year;
        System.out.println("The age is "+age);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        oddOrEven(8);
        System.out.println("Type in the birth year please:");
        int n=sc.nextInt();
        ;age(n);
    }

}
