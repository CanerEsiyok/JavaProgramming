package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] countries={"Japan","Korea","United States","Turkey","United Kingdom","Canada"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p-> p.length()>=10);

     /*   String[] result=new String[list.size()];
        int index=0;
        for (String s : list) {
            result[index++]=s;
        }*/
        countries=list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));

    }
}
