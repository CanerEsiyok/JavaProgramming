package Day16_ForLoopStringPractice;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int countp=0,
                countn=0;
        for (int i = 1; i < 6; i++) {

        System.out.println("Enter number "+i+":");
        int n= sc.nextInt();
        if(n<0)
            countn++;
        else if(n>0)
            countp++;}
        System.out.println(countp+" positive and "+countn+" negative");
    }
}
