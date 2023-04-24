package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Would you like to marry me?:");
        String answer= sc.nextLine();
        answer=answer.toLowerCase();
        while ( !(answer.equals("yes") || answer.equals("no")) ){
            System.err.println("Invalid answer. Please re-enter:");
            answer= sc.nextLine().toLowerCase();
        }
        if (answer.equals("yes"))
            System.out.println("Congrats!!!");
        else System.out.println("Goodbye :(");
    }
}
