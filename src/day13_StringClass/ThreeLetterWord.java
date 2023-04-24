package day13_StringClass;

import java.util.Scanner;

public class ThreeLetterWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3-letter word:");
        String word=sc.next();
        int len=word.length();
        if (len<3)
            System.out.println("Word is too short");
        else if (len>3)
            System.out.println("Word is too long");
        else {
            if ((word.charAt(1))=='a')
                System.out.println("Cool word");
            else System.out.println("Okay word");
        }
    }
}
