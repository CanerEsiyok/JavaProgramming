package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4CombineTwoStringArrayLists {
    public static void main(String[] args) {
        ArrayList<String> str1=new ArrayList<>();
        str1.addAll(Arrays.asList("A","B","C"));
        ArrayList<String> str2=new ArrayList<>();
        str2.addAll(Arrays.asList("D","E","F","G"));
        ArrayList<String> list=new ArrayList<>();

        for (String s : str1) {
            list.add(s);
        }
        for (String s : str2) {
            list.add(s);
        }
        System.out.println(list);
    }
}
