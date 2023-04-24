package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aaabcccdeeef";
        String[] arr=str.split("");
        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
        list.removeIf(p-> Collections.frequency(list,p)>1);
        String result="";
        for (String s : list) {
            result+=s;
        }
        System.out.println(list);
        System.out.println(result);



    }
}
