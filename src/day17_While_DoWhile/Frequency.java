package day17_While_DoWhile;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word");
        String word= sc.next();
        System.out.println("Char");
        char ch= sc.next().charAt(0);
        int len=word.length();
        int count=0;
        for (int i = 0; i < len; i++) {
            if(word.charAt(i)==ch)
                count++;

        }
        System.out.println(count);
    }
}
