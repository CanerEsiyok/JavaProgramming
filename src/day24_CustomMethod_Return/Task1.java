package day24_CustomMethod_Return;

import java.util.Scanner;

public class Task1 {
    public static int frequencyOfTheWord(String sentence,String word){
        int count=0;
        sentence=sentence.toLowerCase();
        while(sentence.contains(word.toLowerCase())){
            sentence=sentence.replaceFirst(word,"");
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sentence:");
        String sentence= sc.nextLine();
        System.out.println("Word:");
        //sc.nextLine();
        String word= sc.next();
        System.out.println(frequencyOfTheWord(sentence,word));
    }
}
