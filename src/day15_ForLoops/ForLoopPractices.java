package day15_ForLoops;

import java.util.Scanner;

public class ForLoopPractices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for (int i=15;i<=45;i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello world");
        System.out.println("***********************************");

        for(int i=100;i>=50;i--)
            System.out.print(i+" ");
        System.out.println();
        System.out.println("Hello world2");
        System.out.println("------------------------------");

        for(int i=1;i<56;i++)
            if(i%2==0)
                System.out.print(i+" ");

    }
}
