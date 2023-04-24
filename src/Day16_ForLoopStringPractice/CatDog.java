package Day16_ForLoopStringPractice;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sentence:");
        String sen=sc.nextLine().toLowerCase();
        int countc=0,
                countd=0;
        for (int i = 0; i < sen.length(); i++) {
            if(sen.contains("cat")){
                sen=sen.replaceFirst("cat","");
                countc++;
            }
        }
        for (int i = 0; i < sen.length(); i++) {
            if(sen.contains("dog")){
                sen=sen.replaceFirst("dog","");
                countd++;
            }

    }   boolean a=countc==countd;
        System.out.println(a);
} }
