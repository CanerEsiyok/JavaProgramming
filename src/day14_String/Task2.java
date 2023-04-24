package day14_String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a word:");
        String word= sc.next();
        if(word.substring(word.length()-2).equals("ly"))
            System.out.println("Really???");
        else System.out.println("never mind");
    }
}
