package day24_CustomMethod_Return;

import java.util.Scanner;

public class WarmUpTasks {
    public static void initials(String name, String surname){
        name=name.toUpperCase().charAt(0)+"";
        surname=surname.toUpperCase().charAt(0)+"";
        System.out.println(name+"."+surname);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in your name:");
        String name= sc.next();
        System.out.println("Surname:");
        String surname= sc.next();
        initials(name,surname);
    }
}
