package day18_NestedLoops;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Word:");
        String word=sc.next();
        String  result="";
        int len=word.length();
        for (int i = 0; i <len ; i++) {
            int count=0;
            for (int j = 0; j < len; j++) {
                if(word.charAt(i)==word.charAt(j))
                    count++;
                
            }if(!result.contains(""+word.charAt(i)))
                result+=""+word.charAt(i)+count;
            
        }
        System.out.println(result);
        

    }
}
