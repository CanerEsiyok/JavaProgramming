package day10_NestedIf;

import java.util.Scanner;

public class HTTPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a code");
        int code= sc.nextInt();
        String message="";
        message=code==200?"OK":code==201?"Created":code==202?"Accepted":code==301?"Moved Permanently":code==303?"See Other":
                code==304?"Not Modified":code==307?"Temporary Redirect":code==400?"Bad Request":code==401?"Unauthorized":code==403?"Forbidden"
                        :code==404?"Not Found":code==410?"Gone":code==500?"Internal Service Error":code==503?"Service Unavailable":"Invalid code";
        System.out.println("message = " + message);
    }
}
