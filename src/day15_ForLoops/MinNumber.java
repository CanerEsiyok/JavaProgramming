package day15_ForLoops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long min=99999999999999990L;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an integer:");
            int num=sc.nextInt();
            if(num<min)
                min=num;



        }
        System.out.println("min = " + min);
    }
}
