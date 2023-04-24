package day13_StringClass;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Split or No split(Yes or No)?");
        String yesNo= sc.next();
        System.out.println("Enter the number of people:");
        int number= sc.nextInt();
        System.out.println("Enter the check amount:");
        int check= sc.nextInt();
        System.out.println("How was the service quality?");
        String service= sc.next();
        System.out.println("Number of the people entered: "+number);
        double factor=0;
        switch (service){
            case "Poor":
                factor=0.05;
                break;
            case "Fair":
                factor=0.1;
                break;
            case "Good":
                factor=0.15;
                break;
            case "Great":
                factor=0.2;
                break;
            case "Excellent":
                factor=0.25;
                break;

        }
        System.out.println("Total to pay: "+(check*factor+check));
        System.out.println("Total tip: "+check*factor);
        System.out.println("Total per person: "+(check*factor+check)/number);
        System.out.println("Tip per person: "+check*factor/number);
    }
}
