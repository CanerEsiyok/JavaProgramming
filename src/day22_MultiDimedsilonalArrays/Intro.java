package day22_MultiDimedsilonalArrays;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        String[] group1={"Jan","Marc","Dol"};
        String[] group2={"Jan","Marc","Dol"};
        String[] group3={"Jan","Marc","Dol"};
        String[][] groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));
        System.out.println("---------------------------------");

        int[][] arr2D={{1,2,3},{4,5},{6,7,8,9}};
        System.out.println(Arrays.deepToString(arr2D));
        arr2D[0][2]=5;
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(arr2D[1][1]);
    }
}
