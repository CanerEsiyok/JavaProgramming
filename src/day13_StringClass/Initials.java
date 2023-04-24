package day13_StringClass;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String name= sc.next();
        System.out.println("Enter your last name:");
        String surname= sc.next();
        char f=name.charAt(0);
        char l=surname.charAt(0);
        String initial=f+"."+l;
        System.out.println("initial = " + initial);
        System.out.println(f+"."+l);
    }
}
