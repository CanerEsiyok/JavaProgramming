package day17_While_DoWhile;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){

            System.out.println("Number:");
            int num=sc.nextInt();
            if(num<0)
                break;
            sum+=num;
        }
        System.out.println(sum);
    }
}
