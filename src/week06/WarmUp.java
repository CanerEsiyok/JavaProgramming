package week06;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String:");
        String str= sc.next();
        int len=str.length();

        for (int i = 0; i <= len; i++) {
            System.out.print(str.substring(0,i));

        }
    }
}
