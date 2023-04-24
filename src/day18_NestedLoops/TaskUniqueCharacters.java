package day18_NestedLoops;

import java.util.Scanner;

public class TaskUniqueCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word:");
        String word= sc.next();

        int len=word.length();
        String result="";

        for (int i = 0; i < len; i++) {
            int count=0;
            for (int j = 0; j < len; j++) {
                if(word.charAt(i)==word.charAt(j))
                    count++;
            } if(count==1)
                result+=word.charAt(i);

        }
        System.out.println(result);
    }
}
