package Day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word:");
        String word= sc.nextLine();

        int len=word.length();
        String result="";
        String mot="";


      /*  for (int i = 0; i <len ; i++) {
            String ch=""+word.charAt(i);
            mot=word.substring(0,i)+word.substring(i+1);

            if(!mot.contains(ch))
                result+=ch;


        }
        System.out.println(result);
*/
        for (int i = 0; i < len; i++) {
            String ch=""+word.charAt(i);
            if(word.indexOf(ch)==word.lastIndexOf(ch))
                result+=ch;

        }
        System.out.println(result);
    }
}
