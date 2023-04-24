package day24_CustomMethod_Return;

import java.util.Scanner;

public class Task5IntegerArray {
    public static int frequency(int[] arr,int n){
        int count=0;
        for (int i : arr) {
            if(i==n)
                count++;
        }
      return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers?");
        int how= sc.nextInt();
        int list[]=new int[how];
        for (int i = 0; i <how ; i++) {
            System.out.println("The numbers:");
            list[i]=sc.nextInt();
        }
        System.out.println("The number whose frequency that you wanna find?");
        int fre=sc.nextInt();
        System.out.println(frequency(list,fre));
    }
}
