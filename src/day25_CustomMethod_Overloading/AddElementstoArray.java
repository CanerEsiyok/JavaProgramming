package day25_CustomMethod_Overloading;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementstoArray {
    public static int[] addInteger(int[] list,int n){
        int added[]=new int[list.length+1];
        int x=0;
        for (int i : list) {
            added[x++]=i;
        }
        added[list.length]=n;
        return added;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The length:");
        int l= sc.nextInt();
        int[] list=new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("Numbers:");
            list[i]=sc.nextInt();
        }
        System.out.println("The number you want to add:");
        int n= sc.nextInt();
        System.out.println(Arrays.toString(addInteger(list,n)));
    }
}
