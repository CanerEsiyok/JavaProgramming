package day23_VoidMethod;

import java.awt.*;
import java.util.Scanner;

public class Task4Vote {
    public static void vote(int n, String pais){
        if(n>=18 && pais.equals("USA"))
            System.out.println("Eligible");
        else System.err.println("Not Eligible");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Age:");
        int age= sc.nextInt();
        System.out.println("Nationality:");
        String nat= sc.next();
        vote(age,nat);
    }
}
