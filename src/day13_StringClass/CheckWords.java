package day13_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First word:");
        String w1= sc.next();
        System.out.println("Second word:");
        String w2= sc.next();
        System.out.println("Third word:");
        String w3= sc.next();
        int l1=w1.length();
        int l2=w2.length();
        int l3=w3.length();
        if(l1==l2&&l2==l3)
            System.out.println("All words are same length");
        else if (l1!=l3&&l1!=l2&&l2!=l3)
            System.out.println("All different lengths");
        else System.out.println("Not Same nor Different lengths");
    }
}
