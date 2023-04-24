package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int number= sc.nextInt();
        String result;
        if (number>=1&&number<=7){
            result=number==1?"Monday":number==2?"Tuesday":number==3?"Wednesday":number==4?"Thursday":number==5?"Friday":
                    number==6?"Saturday":"Sunday";



    }else result="Invalid Number";
        System.out.println("result = " + result);
        sc.close();
} }
