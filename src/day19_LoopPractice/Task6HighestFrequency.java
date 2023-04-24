package day19_LoopPractice;

import java.util.*;
/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;*/

import static java.util.Collections.max;

public class Task6HighestFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word:");
        String word= sc.next();
        List myList=new ArrayList();

        String result="";
        for (int i = 0; i < word.length(); i++) {
            int count=0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j))
                    count++;
            }myList.add(count);

        }System.out.println(max(myList));
    }
}
