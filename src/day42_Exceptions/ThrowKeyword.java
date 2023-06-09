package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<0){
            throw new InputMismatchException("Age can not be negative "+age);

        }

        if(age >20){
            System.out.println("You are eligible");
        }
        else {
            throw new RuntimeException("You must be at least 21 years old");
        }

    }
}
