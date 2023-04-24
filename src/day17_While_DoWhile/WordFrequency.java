package day17_While_DoWhile;

import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String:");
        String str = sc.nextLine();
        System.out.println("Word:");
        String word = sc.next();
        int count=0;
        int len=str.length();
        int lenw=word.length();

        for (int i = 0; i < len; i++) {
            if(str.contains(word)) {
                count++;
                str=str.substring(lenw+str.indexOf(word)); }


        }
        System.out.println(count);
    }
}
