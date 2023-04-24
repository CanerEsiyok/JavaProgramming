package day15_ForLoops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num= sc.nextInt();
            if(num>max)
                max=num;


        }
        System.out.println("max = " + max);
    }
}
