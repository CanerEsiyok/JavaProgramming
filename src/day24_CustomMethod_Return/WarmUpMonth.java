package day24_CustomMethod_Return;

import java.util.Scanner;

public class WarmUpMonth {
    public static void month(int n){
        String result="";
        if(n>=1&&n<=12) {
            result=n==1?"Jan":n==2?"Feb":n==3?"Mar":n==4?"April":n==5?"May":n==6?"Jun":n==7?"Jul":n==8?"Aug":n==9?
                "Sep":n==10?"Oct":n==11?"Nov":"Dec";}
        else
            result="Invalid";
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        month(n);
    }
}
