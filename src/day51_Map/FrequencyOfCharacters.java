package day51_Map;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="bbcccaaaaa";

        Map<String,Integer>result=new LinkedHashMap<>();
        List<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        for (String s : list) {
            result.put(s,Collections.frequency(list,s));
        }
        System.out.println(result);

        List<String> aaa=new ArrayList<>(Arrays.asList("a","a","b","a"));
        System.out.println("Collections.frequency(aaa,\"a\") = " + Collections.frequency(aaa, "a"));


    }
}
