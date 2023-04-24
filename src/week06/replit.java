package week06;

import java.util.Scanner;

public class replit {
    public static int extractNum(String s) {
        String result="";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)))
                result+=s.charAt(i);
        }
        int num=Integer.parseInt(result);
        return num;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next())+2);
    }

}

