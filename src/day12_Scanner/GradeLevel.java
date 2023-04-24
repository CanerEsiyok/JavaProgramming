package day12_Scanner;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type the grade level");
        byte level= sc.nextByte();
        String grade;
        if(level>=1&&level<=18){
            switch (level){
                case 1:case 2:case 3: case 4: case 5:
                    grade="Elementary School";
                    break;
                case 6: case 7: case 8:
                    grade="Middle School";
                    break;
                case 9: case 10: case 11: case 12:
                    grade="High School";
                    break;
                case 13: case 14: case 15 : case 16:
                    grade="College";
                    break;
                default:
                    grade="Grad School";
                    break;
            }
        }else grade="Invalid grade level";
        System.out.println("grade = " + grade);
        sc.close();
    }

}
