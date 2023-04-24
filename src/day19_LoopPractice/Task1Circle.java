package day19_LoopPractice;

import java.util.Scanner;

public class Task1Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
        System.out.println("Enter the radius of the circle:");
        double r=sc.nextDouble();
        if(r<=0){
            System.err.println("Invalid entry for the radius of the circle");
            System.exit(0);
        }
        double area=3.14*r*r;
        double perimeter=2*3.14*r;
        System.out.println("Diameter of circle: "+(2*r));
        System.out.println("Area of circle: "+area);
        System.out.println("Perimeter of circle: "+perimeter);
        System.out.println("Would you like to calculate another circle?");
        String a= sc.next().toLowerCase();
        while(!(a.equals("yes")||a.equals("no"))){
            System.err.println("Invalid entry. Please re-enter:");
            a= sc.next().toLowerCase();
        }
        if(a.equals("no")){
            System.out.println("Thank you for using Cydeo Circle Calculator App");
            System.exit(0);
        }
    }
}}
