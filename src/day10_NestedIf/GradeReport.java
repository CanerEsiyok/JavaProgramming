package day10_NestedIf;
import java.util.*;

public class GradeReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade");
        int grade = sc.nextInt();
        String result;
        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                result="Excellent";
            } else if (grade >= 80) {
                result="Great";
            } else if (grade >= 70) {
                result="Good";

            } else if (grade >= 60) {
                result="Passed";

            } else {
                result="Failed";

            }
        } else {
            result="Invalid";


        }
        System.out.println(result);
    }
}