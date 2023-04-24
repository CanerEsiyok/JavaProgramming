package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinAverage {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int max=-9000;
        int min=10000;
        double total=0;

        for (Integer i : list) {
            if(i>max)
                max=i;
            if(i<min)
                min=i;
            total+=i;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average= "+total/list.size());
    }
}
