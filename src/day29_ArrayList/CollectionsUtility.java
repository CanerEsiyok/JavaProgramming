package day29_ArrayList;

import javax.security.auth.callback.CallbackHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list);
        System.out.println(list);

        System.out.println("------------------------------");
        ArrayList<Character> list2=new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("------------------------------");
        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        System.out.println(list3);
        Collections.swap(list3,1,4);
        System.out.println(list3);

        System.out.println("------------------------------");

        int max=Collections.max(list3);
        System.out.println("max = " + max);

        int min=Collections.min(list3);
        System.out.println("min = " + min);

        System.out.println("------------------------------");

        ArrayList<Integer> list4=new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        Collections.replaceAll(list4,10,1000);
        System.out.println("list4 = " + list4);

        System.out.println("------------------------------");

        int frequency=Collections.frequency(list4,1000);
        System.out.println("frequency = " + frequency);

        System.out.println("------------------------------");

        ArrayList<String> list5= new ArrayList<>();
        list5.addAll(Arrays.asList("Java","Java","Python","Python","Ruby","C#","Java"));
        int freJava=Collections.frequency(list5,"Java");
        int frePython=Collections.frequency(list5,"Python");
        System.out.println("freJava = " + freJava);
        System.out.println("frePython = " + frePython);

    }
}
