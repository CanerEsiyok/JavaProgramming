package day14_String;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First word:");
        String word1= sc.next();
        System.out.println("Second word:");
        String word2= sc.next();

        if(word1.charAt(word1.length()-1)==word2.charAt(0))
            System.out.println(word1+word2.substring(1));
        else System.out.println(word1+word2);
    }
}
