package day12_Scanner;

import java.util.Scanner;

public class MilesToKilometres {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles= sc.nextDouble();
        System.out.println(miles+" miles equal to "+(miles*1.609)+" kilometres");
    }
}
