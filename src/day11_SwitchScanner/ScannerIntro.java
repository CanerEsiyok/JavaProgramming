package day11_SwitchScanner;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num1= input.nextInt();
        System.out.println("Enter a decimal number:");
        double num2= input.nextDouble();
        System.out.println(num2*num1);

     //   input.close(); use it to close the scanner


    }
}
