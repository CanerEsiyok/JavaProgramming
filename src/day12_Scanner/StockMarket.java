package day12_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many total shares do you already have?:");
        int totalShares=sc.nextInt();
        if (totalShares<=0)
            System.out.println("Invalid input");
        else {
            System.out.println("How much is the value of your total stock in the market?:");
            double value=sc.nextDouble();
            System.out.println("Enter the name of the company you have the most shares at:");
            sc.nextLine();
            String companyName=sc.nextLine();
            System.out.println("Your total stock market holding is "+"$"+value+" which is made up of "+totalShares+" shares. "+companyName+" is your company holdings.");
        }
    }
}
