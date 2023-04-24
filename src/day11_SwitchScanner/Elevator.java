package day11_SwitchScanner;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the floor number:");
        int floorNumber= sc.nextInt();
        String result;
        switch (floorNumber){
            case 1:
                result="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                result="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                result="Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                result="Invalid Floor-6";
                break;
        }
        System.out.println(result);


}}
