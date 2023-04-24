package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(40);

        ArrayList<Integer> result=new ArrayList<>();
        for (Integer i : list) {
            if(!result.contains(i))
                result.add(i);
        }
        System.out.println(result);
    }
}
