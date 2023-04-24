package day13_StringClass;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a sentence:");
        String sentence=sc.nextLine();
        char first=sentence.charAt(0);
        char last=sentence.charAt(sentence.length()-1);
        System.out.println("first = " + first);
        System.out.println("last = " + last);
    }
}
