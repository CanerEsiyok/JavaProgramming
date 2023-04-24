package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product name:");
        String productName= sc.nextLine();
        System.out.println("Enter the price:");
        double price= sc.nextDouble();
        System.out.println("Enter the quantity:");
        int quantity= sc.nextInt();
        System.out.println("Enter your first name");
        String firstName= sc.next();
        System.out.println(firstName+" your order for "+quantity+" "+productName+" has been placed. Your total is "+price+".");
        sc.close();
    }
}
