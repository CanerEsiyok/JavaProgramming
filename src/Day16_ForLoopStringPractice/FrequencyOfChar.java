package Day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in a string:");
        String word= sc.nextLine();
        System.out.println("Type in a char:");
        char ch=sc.next().charAt(0);
        int count=0;
        int len=word.length();

        for (int i = 0; i < len; i++) {
            if(ch==word.charAt(i))
                count++;

        }
        System.out.println(count);


    }
}
