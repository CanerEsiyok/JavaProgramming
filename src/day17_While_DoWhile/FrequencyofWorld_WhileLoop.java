package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyofWorld_WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sentence:");
        String sentence= sc.nextLine().toLowerCase();
        System.out.println("Type in a word:");
        String word= sc.next().toLowerCase();
        int count=0;

        while (sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            count++;
        }
        System.out.println(count);
    }
}
