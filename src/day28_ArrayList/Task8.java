package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer score : scores) {
            if(score>=90)
                gradeOfA.add(score);
            else if (score>=80)
                gradeOfB.add(score);
            else if (score>=70)
                gradeOfC.add(score);
            else if (score>=60)
                gradeOfD.add(score);
            else
                gradeOfF.add(score);
        }
        System.out.println("A= "+gradeOfA.size());
        System.out.println("B= "+gradeOfB.size());
        System.out.println("C= "+gradeOfC.size());
        System.out.println("D= "+gradeOfD.size());
        System.out.println("F= "+gradeOfF.size());


    }
}
