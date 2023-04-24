package day15_ForLoops;

import java.util.Scanner;

public class WarmUp3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First name:");
        String name= sc.next();
        System.out.println("Last name:");
        String lastName= sc.next();
      /*  name=name.toLowerCase();
        String nameB=name.toUpperCase();
        name=nameB.substring(0,1)+name.substring(1);
        lastName=lastName.toLowerCase();
        String last=lastName.substring(0,1);
        last=last.toUpperCase()+lastName.substring(1);
       System.out.println(name+" "+last);*/

        name=name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
        lastName= (""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(name+" "+lastName);



    }
}
