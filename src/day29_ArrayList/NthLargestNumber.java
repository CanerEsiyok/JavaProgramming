package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
      /*  int max= Collections.max(list);
        list.removeAll(Arrays.asList(max));
        int max2=Collections.max(list);
        list.removeAll(Arrays.asList(max2));
        int result=Collections.max(list);*/

        for (int i = 1; i < 3; i++) {
        list.removeIf(p-> p==Collections.max(list));}
        int max=Collections.max(list);
        System.out.println(max);
    }
}
