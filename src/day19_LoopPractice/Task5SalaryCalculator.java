package day19_LoopPractice;

import java.util.Scanner;

public class Task5SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("How much you make an hour?:");
        double hourlyRate= sc.nextDouble();
        if (hourlyRate<=0){
            System.err.println("Invalid entry for hourly rate");
            System.exit(0);
        }
        System.out.println("How many hours do you work a week?:");
        int weeklyHour= sc.nextInt();
        if(weeklyHour<1||weeklyHour>144){
            System.err.println("Invalid entry pour weekly hour");
            System.exit(0);
        }
        System.out.println("Enter your state tax rate:");
        int taxRate=sc.nextInt();
        if(taxRate<0||taxRate>10){
            System.err.println("Invalid entry pour tax rate");
            System.exit(0);
        }
        double salary=4*weeklyHour*hourlyRate;
        System.out.println("Gross salary: "+salary);
        System.out.println("Federal tax: "+salary*0.26);
        System.out.println("State tax: "+salary*taxRate/100);
        System.out.println("Total tax: "+(salary*0.26+salary*taxRate/100));
        System.out.println("Net income: "+(salary-(salary*0.26+salary*taxRate/100)));

        System.out.println("Would you like to continue?");
        String a= sc.next();
        if(a.equals("no")){
            System.out.println("Thank you for using Cydeo Salary Calculator APP");
            break;
        } else if (!a.equals("yes")) {
            System.err.println("Invalid entry");
            System.exit(0);

        }
    }}
}
