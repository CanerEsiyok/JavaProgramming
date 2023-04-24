package day24_CustomMethod_Return;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 { public static int[] addElement(int[] list, int n){
    int[] add=new int[list.length+1];
    int a=0;
    for (int i : list) {
        add[a++]=i;
    }
    add[list.length]=n;
    return add;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The length of the array:");
        int l= sc.nextInt();
        int[] list=new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("The number:");
            list[i]=sc.nextInt();
        }
        System.out.println("Enter the number that you wanna add:");
        int n= sc.nextInt();

        System.out.println(Arrays.toString(addElement(list,n)));
    }

}
