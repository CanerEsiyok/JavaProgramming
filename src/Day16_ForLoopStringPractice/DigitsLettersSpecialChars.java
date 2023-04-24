package Day16_ForLoopStringPractice;

import java.util.Scanner;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word:");
        String word= sc.nextLine();

        int len=word.length();
        String digits="",
                letters="",
                special="";

        for (int i = 0; i <len ; i++) {
            char ch=word.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                letters+=ch;
            else if(ch>='0'&&ch<='9') {
                if(ch!='0')
                digits+=ch; }
            else {
                if(ch!=' ')
                special += ch;
            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("special = " + special);
    }
}
