package day23_VoidMethod;


import java.util.Scanner;

public class Task3 {
    public static void eligible(int n){
        if (n>=18)
            System.out.println("Eligible to buy alcohol");
        else System.out.println("Not eligible");
    }

    public static void main(String[] args) {
        System.out.println("Type in your age:");
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        eligible(age);
    }
}
