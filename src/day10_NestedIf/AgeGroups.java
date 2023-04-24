package day10_NestedIf;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age= sc.nextInt();
        String result;

        if (age<=150&&age>=0){
            if(age<21)
                result="Teenager";
            else if (age<55&&age>=21)
                result="Adult";
            else result="Senior";

        }else result="Invalid";
        System.out.println(result);
    }
}
