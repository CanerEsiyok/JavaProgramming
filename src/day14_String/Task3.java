package day14_String;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a word:");
        String word= sc.next();
        if(word.charAt(0)=='x')
            System.out.println(word.substring(1));
        else System.out.println(word);
    }
}
