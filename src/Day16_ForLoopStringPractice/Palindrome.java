package Day16_ForLoopStringPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word:");
        String word=sc.nextLine();

        String result="";
        int len=word.length();
        for (int i = len-1; i >=0 ; i--) {
            result+=word.charAt(i);

        }
        boolean a= (result.equalsIgnoreCase(word));
            System.out.println(a);
    }
}
