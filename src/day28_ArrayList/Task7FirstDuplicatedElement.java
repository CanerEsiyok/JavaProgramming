package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7FirstDuplicatedElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,20,2,3,4,4,5,6,7,7));
        ArrayList<Integer> result=new ArrayList<>();
        for (Integer i : list) {
            if(!result.contains(i)){
                result.add(i);
                continue;}
            if(result.contains(i)){
                System.out.println(i);
                break;}


        }
       // System.out.println(result);
    }
}
