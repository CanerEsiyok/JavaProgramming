package day23_VoidMethod;

import java.util.Scanner;

public class Task16 {
    public static void full(String name,String sec){
        name=name.toUpperCase().charAt(0)+name.toLowerCase().substring(1);
        sec= sec.toUpperCase().charAt(0)+sec.toLowerCase().substring(1);
        System.out.println(name+" "+sec);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        String name= sc.next();
        System.out.println("Surname:");
        String sec= sc.next();
        full(name,sec);
    }
}
