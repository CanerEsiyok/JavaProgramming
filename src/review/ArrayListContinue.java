package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListContinue {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8));
        list.removeIf(p-> p<5);
        System.out.println(list);

        ArrayList<Integer> arr=new ArrayList<>();
        arr.addAll(Arrays.asList(10,30,40,20,90,60,50));
        Collections.sort(arr);
        System.out.println(arr);
        int max=Collections.max(arr);
        System.out.println(max);
        int min=Collections.min(arr);
        System.out.println(min);
        Collections.reverse(arr);
        System.out.println(arr);
        Collections.swap(arr,1,4);
        System.out.println(arr);
        Collections.swap(arr,0,arr.size()-1);
        System.out.println(arr);
        arr.addAll(Arrays.asList(50,50,50));
        System.out.println(arr);
        int fre=Collections.frequency(arr,50);
        System.out.println(fre);
    }
}
