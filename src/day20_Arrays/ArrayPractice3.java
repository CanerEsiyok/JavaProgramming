package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers:");
        int num=sc.nextInt();
        if (num<=0) {
            System.err.println("Invalid entry");
            System.exit(0);
        }
        int list[]=new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter a number:");
            list[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(list));


    }
}
