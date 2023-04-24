package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6MinNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,-3,4,5));
        int min=1000000;

        for (Integer i : list) {
            if(i<min)
                min=i;
        }
        System.out.println(min);
    }
}
