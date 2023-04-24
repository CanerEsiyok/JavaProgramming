package day10_NestedIf;
import java.util.*;

public class NestedIfIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score of the student");
        int score= sc.nextInt();
        if(score>=0&&score<=100){
            if (score >= 60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
        }
    }else{
            System.out.println("Invalid score");
} }}
