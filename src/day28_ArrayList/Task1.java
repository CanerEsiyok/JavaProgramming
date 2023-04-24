package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        list.set(list.size()-1,0);
        System.out.println("list = " + list);

    }
}
