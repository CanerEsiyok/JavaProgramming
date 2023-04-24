package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?:");
        int how = sc.nextInt();
        int list[] = new int[how];
        int min=100000;
        for (int i = 0; i < list.length; i++) {
            System.out.println("Number:");
            list[i]=sc.nextInt();
            if (list[i]<min){
                min=list[i];
            }


        }
        System.out.println(Arrays.toString(list));
        System.out.println(min);
    }
}
