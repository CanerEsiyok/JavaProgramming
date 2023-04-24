package day19_LoopPractice;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String:");
        String str=sc.next();
        String result="";
        int com=0;
        for (int i = 0; i < str.length(); i++) {
            int count=0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j))
                    count++;

            }if(count>com){
                com=count;
                result=""+str.charAt(i);
        }}
        System.out.println(result);
    }
}
