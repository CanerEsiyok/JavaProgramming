package day23_VoidMethod;

import java.util.Scanner;

public class Task12 {
    public static void number(int n){
        String result=n>0?"Positive":n==0?"Zero":"Negative";
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a number:");
        int n=sc.nextInt();
        number(n);
    }
}
