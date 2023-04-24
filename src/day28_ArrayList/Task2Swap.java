package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        Integer tem=list.get(0);
       // System.out.println(tem);
       // System.out.println(list.get(list.size()-1));
        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1,tem);
        System.out.println(list);

    }
}
