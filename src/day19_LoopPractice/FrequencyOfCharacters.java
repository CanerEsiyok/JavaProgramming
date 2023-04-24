package day19_LoopPractice;

import java.util.Scanner;

public class FrequencyOfCharacters {
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
            }  if(!result.contains(""+str.charAt(i)))
            result+=""+str.charAt(i)+count;

        }
        System.out.println(result);
    }
}
