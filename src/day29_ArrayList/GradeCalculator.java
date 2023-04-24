package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 ~ 59

        gradeOfA.removeIf(p->!(p>=90));
        gradeOfB.removeIf(p->!(p>=80 && p<90));
        gradeOfC.removeIf(p->!(p>=70 && p<79));
        gradeOfD.removeIf(p->!(p>=60 && p<69));
        gradeOfF.removeIf(p->!(p<60));

        System.out.println(gradeOfA);
        System.out.println(gradeOfB);
        System.out.println(gradeOfC);
        System.out.println(gradeOfD);
        System.out.println(gradeOfF);

    }
}
