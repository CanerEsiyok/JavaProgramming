package day15_ForLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Word:");
        String word = sc.next();
        int len = word.length();
        String wordReverse = "";

        for (int i = len - 1; i >= 0; i--) {
            wordReverse += "" + word.charAt(i);

        } boolean a=(word.equals(wordReverse));
        System.out.println(a);
    }
}








