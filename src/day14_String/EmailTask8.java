package day14_String;

import java.util.Scanner;

public class EmailTask8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Email Address:");
        String email= sc.next();
        String name=email.substring(0,email.indexOf("_"));
      //  System.out.println(name);
        String nameB=name.toUpperCase();
        String nameS=nameB.charAt(0)+name.substring(1);
       // System.out.println(nameS);
        String last=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String lastB=last.toUpperCase();
        String lastS=lastB.charAt(0)+last.substring(1);
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("First name: "+nameS+"\nLast name: "+lastS+"\nDomain: "+domain);

    }
}
