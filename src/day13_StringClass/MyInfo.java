package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= sc.nextInt();
        System.out.println("Enter your gender:");
        String gender=sc.next();
        sc.nextLine();
        System.out.println("Enter your full name:");
        String fullName=sc.nextLine();
        System.out.println("Enter your phone number:");
        long phoneNumber= sc.nextLong();
        System.out.println("Enter your zip code:");
        int zipCode= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your school name:");
        String schoolName=sc.nextLine();
        System.out.println("Enter your city name:");
        String city=sc.nextLine();
        System.out.println("Enter your state name:");
        String state=sc.next();
        System.out.println("Enter your building number:");
        int buildingNumber= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your street name:");
        String street=sc.nextLine();
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Address:\n\t"+buildingNumber+" "+street+"\n\t"+city+" "+state+" "+zipCode);

    }
}
