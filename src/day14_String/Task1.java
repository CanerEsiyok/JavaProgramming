package day14_String;

import java.awt.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in the first word:");
        String word1= sc.next();
        System.out.println("Type in the second word:");
        String word2= sc.next();
        word1=word1.substring(1);
        word2=word2.substring(1);
        System.out.println(word1+word2);
    }
}
