package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate=50;
        int weeklyHours=40;
        int salary=hourlyRate*weeklyHours*52;
        //System.out.println(salary);
        System.out.println("salary = €" + salary);
        //hourlyRate = 55;
       // System.out.println("salary 2 = €" + salary);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = " + hourlyRate);
    }
}
