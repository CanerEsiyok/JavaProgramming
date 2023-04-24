package day13_StringClass;

import java.util.Scanner;

public class EmptyOrThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String word=sc.nextLine();
        int len=word.length();
        if(len==0)
            System.out.println("String is empty");
        else if(len>3)
            System.out.println(""+(word.charAt(word.length()-3))+(word.charAt(word.length()-2))+(word.charAt(word.length()-1)));
        else System.out.println(word);
    }

}
