package Day16_ForLoopStringPractice;

import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sentence:");
        String sen=sc.nextLine();
        int len=sen.length();
        String result="";
        int count=0;
        for (int i = 0; i < len; i++) {
            if(sen.contains("Java")){
                sen=sen.replaceFirst("Java","");
                count++;
            }

        }
        System.out.println(count);
    }
}
