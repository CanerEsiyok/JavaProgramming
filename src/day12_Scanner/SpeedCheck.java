package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the current speed:");
        int speed= sc.nextInt();
        int speedLimit=55;
        if (speed>speedLimit)
            System.out.println("You are driving "+(speed-speedLimit)+" mph over the limit. Slow down!");else
            System.out.println("Your speed is "+speed+" mph. Safe travel :)");
    }
}
