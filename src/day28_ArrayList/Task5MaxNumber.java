package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,30,4,5));

        Integer max=0;
        String result="";
        for (Integer i : list) {
            if(i>max)
                max=i;

        }
        System.out.println(max);
    }
}
