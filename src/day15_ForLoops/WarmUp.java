package day15_ForLoops;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a word");
        String word=sc.next();
      /*  if(word.startsWith("x"))
            word=word.replaceFirst("x","a");
        System.out.println(word);*/
        if(word.charAt(0)=='x')
            word=word.replaceFirst("x","a");
        System.out.println(word);
    }
}
