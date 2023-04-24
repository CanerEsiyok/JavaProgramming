package day15_ForLoops;

import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a word:");
        String word=sc.next();
        word=word.replace("x","a").replace("X","a");
       // word=word.replace("X","a");
        System.out.println(word);
    }
}
