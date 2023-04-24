package Day16_ForLoopStringPractice;

import java.util.Scanner;

public class DuplicatedCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word:");
        String word= sc.nextLine();

        int len=word.length();
        String result="";

        for (int i = 0; i < len; i++) {
            if(!result.contains(""+word.charAt(i)) )
                result+=word.charAt(i);

        }
        System.out.println(result);

    }
}
