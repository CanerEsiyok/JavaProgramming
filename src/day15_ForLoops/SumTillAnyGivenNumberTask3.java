package day15_ForLoops;

import day04_Variables.SalaryCalculator;

import java.util.Scanner;

public class SumTillAnyGivenNumberTask3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=sc.nextInt();
        int total=0;

        for (int i =1 ; i <=num ; i++) {
            total+=i;
            
        }
        System.out.println(total);
    }
}
