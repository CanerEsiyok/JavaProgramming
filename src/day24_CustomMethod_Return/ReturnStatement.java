package day24_CustomMethod_Return;

import java.util.Scanner;

public class ReturnStatement {
    public static void day(int n){
        if(n<1 || n>7){
            System.err.println("Invalid");
            return;}
        if(n==1)
            System.out.println("Monday");
        else if(n==1)
            System.out.println("Monday");
        else if(n==2)
            System.out.println("Tue");
        else if(n==3)
            System.out.println("Wed");
        else if(n==4)
            System.out.println("Thurs");
        else if(n==5)
            System.out.println("Friday");
        else if(n==6)
            System.out.println("Sat");
        else System.out.println("Sunday");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        day(n);
    }
}
