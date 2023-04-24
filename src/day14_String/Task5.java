package day14_String;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word:");
        String word=sc.nextLine();
        if(word.charAt(0)>=48&&word.charAt(0)<=57)
            System.out.println("first character is digit ");
        else if(word.charAt(0)>=65&&word.charAt(0)<=90)
            System.out.println("first character is uppercase letter");
        else if(word.charAt(0)>=97&&word.charAt(0)<=122)
            System.out.println("first character is lowercase letter");
        else System.out.println("first character is special character");



    }
}
