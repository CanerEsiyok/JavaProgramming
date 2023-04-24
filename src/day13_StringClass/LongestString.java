package day13_StringClass;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a string:");
        String s1= sc.nextLine();
        System.out.println("Type in another string:");
        String s2=sc.nextLine();
        int str1=s1.length();
        int str2=s2.length();

        if (str1>str2)
            System.out.println("The longest string is: "+s1);
        else System.out.println("The longest string is: "+s2);

} }
