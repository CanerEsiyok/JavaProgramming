package day17_While_DoWhile;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First number:");
        double num= sc.nextDouble();
        System.out.println("Divisor:");
        int div= sc.nextInt();
        int count=0;
        while(num>=div){
            num-=div;
            count++;
        }
        System.err.println(count);
    }
}
