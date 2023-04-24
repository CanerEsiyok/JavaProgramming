package day23_VoidMethod;

import java.util.Arrays;
import java.util.Scanner;

public class Task17_Anagram {
    public static void anagram(String a,String b){
        char[] word1=a.toCharArray();
        Arrays.sort(word1);
        char[] word2=b.toCharArray();
        Arrays.sort(word2);
        if(Arrays.equals(word1,word2))
            System.out.println(a+" and "+b+" are anagram");
        else System.out.println("They are not anagram");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First word:");
        String a= sc.next();
        System.out.println("Second word:");
        String b=sc.next();
        anagram(a,b);
    }
}
