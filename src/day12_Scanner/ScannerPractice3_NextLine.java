package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName= sc.nextLine();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your school name");
        String schoolName=sc.nextLine();
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

    }
}
