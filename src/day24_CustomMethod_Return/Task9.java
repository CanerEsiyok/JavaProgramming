package day24_CustomMethod_Return;

import java.util.Scanner;

public class Task9 {
    public static boolean contains(int[] list,int n){
        int count=0;
        for (int i : list) {
            if(i==n)
                count++;
        }
        if(count>=1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The length:");
        int l= sc.nextInt();
        int[] list=new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("The number:");
            list[i]=sc.nextInt();
        }
        System.out.println("The number that you want to check:");
        int n= sc.nextInt();
        System.out.println(contains(list,n));
    }
}
