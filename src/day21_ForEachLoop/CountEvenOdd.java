package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int len=sc.nextInt();
        int[] list=new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Number:");
            list[i]=sc.nextInt();
        }
        int ceven=0;
        int codd=0;
        for (int i : list) {
            if(i%2==0)
                ceven++;
            else codd++;
        }
        System.out.println(Arrays.toString(list));
        System.out.println("Even numbers: "+ceven);
        System.out.println("Odd numbers: "+codd);
    }
}
