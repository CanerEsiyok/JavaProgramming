package day10_NestedIf;
import java.util.*;

public class GradeReportTernaries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade");
        int g= sc.nextInt();
        String grade= g>=0&&g<=100?(g>=90)?"Excellent":g>=80?"Great":g>=70?"Good":g>=60?"Passed":"Failed":"Invalid";
        System.out.println("grade = " + grade);

    }
}
