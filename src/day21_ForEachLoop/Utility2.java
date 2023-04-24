package day21_ForEachLoop;

import java.util.Arrays;

public class Utility2 {
    public static void main(String[] args) {
        String[] students={"Elif","Sinem","Gunay","Cihan","David","James","Aaron","Daniel"};
        String[] earlyBirds= Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds));
        int[] num={1,2,3,4,5,6,7,8,9,10};
        int[] an=Arrays.copyOfRange(num,3,7);
        System.out.println(Arrays.toString(an));


    }
}
