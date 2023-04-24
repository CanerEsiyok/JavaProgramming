package day15_ForLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int total=1;

        for (int i = num; i >=1 ; i--) {
            total*=i;
        }
        System.out.println(total);
    }
}
