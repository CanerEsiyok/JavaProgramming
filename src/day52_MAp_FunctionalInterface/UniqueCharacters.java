package day52_MAp_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aabcccdeeeef";

        Map<String,Integer> result=new LinkedHashMap<>();
        List<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        for (String s : list) {
            if(Collections.frequency(list,s)==1)
                result.put(s,Collections.frequency(list,s));
        }
        System.out.println(result);
    }
}
