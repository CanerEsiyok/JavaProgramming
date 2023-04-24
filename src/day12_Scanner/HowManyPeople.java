package day12_Scanner;

import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many people do you use with?:");
        int n= sc.nextInt();
        String result = null;
        if(n>0){
        switch (n){
            case 1: case 2:
                result="Less than 3 people";
                break;
            case 3: case 4: case 5: case 6:
                result="Live with 3-6 people";
                break;
            default:
                result="More than 6 people";
                break;
        }
    }else result="Wrong input";
        System.out.println(result);
} }
