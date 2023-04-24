package day17_While_DoWhile;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to reserve a room?:yes/no");
        String ans= sc.next();

        while(!(ans.equals("yes")||ans.equals("no"))) {
            System.err.println("Invalid answer, please re-enter:");
            ans = sc.next();
        }
        if(ans.equals("yes")) {
            System.out.println("Which type of room do you want to reserve?");
            System.out.println("King Bed, Queen Bed or Single Bed?");
            sc.nextLine();
            String bed = sc.nextLine().toLowerCase();
            int result = bed.equals("king bed") ? 120 : bed.equals("queen bed") ? 100 : 80;
            System.out.println(result + "$");
            }


        else
            System.out.println("Have a nice day");

        }
    }



