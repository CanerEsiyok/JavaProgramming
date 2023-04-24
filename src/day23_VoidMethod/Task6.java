package day23_VoidMethod;

import java.util.Scanner;

public class Task6 {
    public static void area(double r) {
        double area=3.14*r*r;
        System.out.println(area);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Radius of the circle");
        double r= sc.nextDouble();
        area(r);
    }
}
