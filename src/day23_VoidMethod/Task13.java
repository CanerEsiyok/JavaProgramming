package day23_VoidMethod;

import java.util.Scanner;

public class Task13 {
    public static void each(String sen){
    for (int i = 0; i < sen.length(); i++) {
        System.out.println(sen.charAt(i));
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sentence:");
        String sen=sc.nextLine();
        each(sen);
    }
}

