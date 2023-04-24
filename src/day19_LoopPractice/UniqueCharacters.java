package day19_LoopPractice;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String:");
        String str= sc.next();
        int len=str.length();
        String result="";
        for (int i = 0; i < len; i++) {
            int count=0;
            for (int j = 0; j < len; j++) {
                if(str.charAt(i)==str.charAt(j))
                    count++;
            } if(count==1)
                result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
