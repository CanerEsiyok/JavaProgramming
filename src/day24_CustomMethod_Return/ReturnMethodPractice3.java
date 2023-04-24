package day24_CustomMethod_Return;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnMethodPractice3 {
    public static String[] unique(String str){
        String[] result=new String[10];
        int a=0;
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j))
                    count++;
            }
            if(count==1){
                result[a]=str.charAt(i)+"";
                a++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.next();

        System.out.println(Arrays.toString(unique(str)));

    }
}
