package day15_ForLoops;

import java.util.Scanner;

public class SumFromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int len=str.length();
        int total=0;
        int ch=0;

        for (int i = 0; i < len; i++) {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
                ch=str.charAt(i)-48;
                total+=ch;
        }

    } System.out.println(total);
} }
