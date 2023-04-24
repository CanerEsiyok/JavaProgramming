package Day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a string:");
        String str=sc.nextLine();
        int len=str.length();
        String word="";

        for (int i = len-1; i >=0 ; i--) {
            word+=""+str.charAt(i);

        }
        System.out.println(word);
    }
}
