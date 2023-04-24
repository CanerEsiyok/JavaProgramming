package day13_StringClass;

import java.util.Scanner;

public class SameOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a string:");
        String str=sc.nextLine();
        char f=str.charAt(0);
        char l=str.charAt(str.length()-1);
        boolean sameOrNot=f==l;
        System.out.println("sameOrNot = " + sameOrNot);
    }
}
