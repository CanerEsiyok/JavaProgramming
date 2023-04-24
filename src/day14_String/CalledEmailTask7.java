package day14_String;

import java.util.Scanner;

public class CalledEmailTask7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Email address:");
        String email= sc.next();
        if(email.contains("_")) {
            System.out.println(email.substring(email.indexOf("_")+1,email.indexOf("@"))+"_"+email.substring(0,email.indexOf("_"))+
                    email.substring(email.indexOf("@")));
        }
        else System.out.println(email);


    }
}
