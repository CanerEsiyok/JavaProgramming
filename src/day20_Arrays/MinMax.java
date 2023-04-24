package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int list[]=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number:");
            list[i]=sc.nextInt();
        }
        int max=list[0];
        int min=list[0];
        for (int i = 0; i < list.length; i++) {
            if(list[i]>max){
                max=list[i];
            }
            if(list[i]<min){
                min=list[i];
            }

        }
        System.out.println(Arrays.toString(list));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
