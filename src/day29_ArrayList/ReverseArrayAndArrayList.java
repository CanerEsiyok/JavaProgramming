package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int[] reverse=new int[array.length];
        int index=0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[index++]=array[i];
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("--------------------------------");

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        ArrayList<Integer> result=new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        System.out.println(result);

    }
}
