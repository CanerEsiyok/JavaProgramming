package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sentence:");
        String sentence=sc.nextLine();
        int countj=0;
        int countp=0;

        String[] word=sentence.split(" ");
     //  System.out.println(Arrays.toString(word));

        for (String s : word) {
            if(s.toLowerCase().contains("java"))
                countj++;
            if(s.toLowerCase().contains("python"))
                countp++;
        }
        System.out.println("Java: "+countj);
        System.out.println("Python: "+countp);
    }
}
