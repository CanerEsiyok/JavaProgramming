package day09_IfStatements;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade to find out where you are going");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("location -  Apple orchard\nnumber of groups - 3\nteacher in charge - Ms. Smith");

        } else if (a == 2) {
            System.out.println("location - Zoo\nnumber of groups - 7\nteacher in charge - Mr. Lee");

        } else if (a == 3) {
            System.out.println("location - Aquarium\nnumber of groups - 5\nteacher in charge - Ms. Wilson");

        } else if (a == 4) {
            System.out.println("location - Movie theater\nnumber of groups - 2\nteacher in charge - Ms. Reyes");

        } else if (a == 5) {
            System.out.println("location - Museum\n" +
                    "number of groups - 5\n" +
                    "teacher in charge - Ms. Lela");

        } else if (a == 6) {
            System.out.println("location - Six Flags\n" +
                    "number of groups - 8\n" +
                    "teacher in charge - Mr. Watt");

        } else {
            System.out.println("Invalid number");
        }
    }
}
