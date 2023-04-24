package day13_StringClass;

import java.util.Scanner;

public class InitialsTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in your first name:");
        String name= sc.next();
        System.out.println("Type in your last name:");
        String lastName= sc.next();
        char f=name.charAt(0);
        char f1=lastName.charAt(0);
        System.out.println(f+"."+f1);

    }
}
