package day15_ForLoops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int len=str.length();
        String son="";

        for (int i = len-1; i >=0 ; i--) {

            son+=""+str.charAt(i);

        }
        System.out.println(son);

    }
}
