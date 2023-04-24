package day19_LoopPractice;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        if(num%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        System.out.println("Would you like to add another number?yes/no");
        String a= sc.next();
        while(!(a.equals("yes")||a.equals("no"))){
            System.err.println("Invalid entry. Please re-enter:");
            a=sc.next();
        }
        if(a.equals("no"))
            System.exit(0);



    }}
}
