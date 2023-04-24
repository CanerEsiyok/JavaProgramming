package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName=sc.nextLine();
        System.out.println("Enter your building number:");
        String buildingNumber=sc.next();
        sc.nextLine();
        System.out.println("Enter your street name");
        String streetName= sc.nextLine();
        System.out.println("Enter city name:");
        String cityName= sc.nextLine();
        System.out.println("Enter your state:");
        String state= sc.next();
        System.out.println("Enter your zip code");
        String zipCode=sc.next();
        sc.nextLine();
        System.out.println("Enter country name:");
        String country=sc.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);


    }
}
