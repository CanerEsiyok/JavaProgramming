package day24_CustomMethod_Return;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static int[] removeElement(int[] list,int n){
        int remove[]=new int[list.length-1];
        for (int i = 0; i < list.length; i++) {
            if(i==n)
                break;
            remove[i]=list[i];
          //  System.out.println(remove[i]);
        }
        for (int i = n; i < list.length-1 ; i++) {
            remove[i]=list[i+1];
        //    System.out.println(remove[i]);
        }
        return remove;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The length:");
        int l= sc.nextInt();
        int[] list=new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("The numbers:");
            list[i]=sc.nextInt();
        }
        System.out.println("The index of the number that you wanna remove:");
        int index= sc.nextInt();
        System.out.println(Arrays.toString(removeElement(list,index)));
    }
}
