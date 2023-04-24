package day13_StringClass;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a word:");
        String word=sc.next();
        int len=word.length();
        if(len<5)
            System.out.println("Too short");
        else if (len>5)
            System.out.println("Too long");
        else {
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }
    }
}
