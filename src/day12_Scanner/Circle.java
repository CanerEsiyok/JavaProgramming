package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        double r=sc.nextDouble();
        sc.close();
        double pi=3.14;
        double area=pi*r*r;
        float perimeter= (float) (2*pi*r);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
