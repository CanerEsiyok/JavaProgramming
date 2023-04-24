package day15_ForLoops;

import java.util.Scanner;

public class RetriverTask5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();

        String digits="",
                letters="",
                ch="";
        int len=str.length();

        for (int i = 0; i <len ; i++) {
            if((str.charAt(i)>='a'&& str.charAt(i)<='z')||(str.charAt(i)>='A'&& str.charAt(i)<='Z'))
                letters+=""+str.charAt(i);
            else if((str.charAt(i)>='0'&& str.charAt(i)<='9'))
                digits+=""+str.charAt(i);
            else ch+=""+str.charAt(i);


        }
        System.out.println("letters :"+letters);
        System.out.println("digits: "+digits );
        System.out.println("special chars: "+ch);

    }
}
