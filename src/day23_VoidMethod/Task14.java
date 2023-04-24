package day23_VoidMethod;

import java.util.Scanner;

public class Task14 {
    public static void each(int[] list){
        for (int i : list) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number of the array");
        int f= sc.nextInt();
        System.out.println("Enter the last number of the array");
        int l= sc.nextInt();
        int[] list=new int[l-f+1];
        int a=f;
        for (int i = 0; i <l-f+1; i++) {
            list[i]=a++;
           // System.out.println(list[i]);
        }
        each(list);
    }
}
