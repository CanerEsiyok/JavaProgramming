package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Age:");
        int age= sc.nextInt();

        while(!(age>=1 && age <=120)) {
            System.err.println("Invalid entry. Please re-enter:");
            age= sc.nextInt();
        }
        System.out.println("Are you a US Citizen?(yes/on):");
        String answer= sc.next();
        answer=answer.toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry. Please re-enter:");
            answer=sc.next();
        }

        if(age>=18&&answer.equals("yes"))
            System.out.println("Eligible to vote");
        else System.out.println("NOT Eligible to vote");
    }
}
