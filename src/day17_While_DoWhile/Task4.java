package day17_While_DoWhile;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        String by15="",
                by5="",
                by3="";

        for (int i = 1; i <= num; i++) {
            if(i%15==0)
                by15+=i+" ";
            else if(i%3==0)
                by3+=i+" ";
            else if(i%5==0)
                by5+=i+" ";



        }
        System.out.println("Divisible By 15: "+by15);
        System.out.println("Divisible By 3: "+by3);
        System.out.println("Divisible By 5: "+by5);

    }
}
