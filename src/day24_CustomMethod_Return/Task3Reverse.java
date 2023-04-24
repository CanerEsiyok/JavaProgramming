package day24_CustomMethod_Return;

import java.util.Scanner;

public class Task3Reverse {
    public static String reverse(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String:");
        String str= sc.next();
        System.out.println(reverse(str));
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String word){
        if(word.equalsIgnoreCase(reverse(word)))
            return true;
        else
            return false;
    }
}
