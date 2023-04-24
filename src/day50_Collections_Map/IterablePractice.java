package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        Iterator<Integer> it = list.iterator();
     /*   boolean r1 = it.hasNext();
        System.out.println(r1);
        System.out.println(it.next());
        System.out.println(it.next());*/
        while(it.hasNext()){
            if(it.next()<4)
                it.remove();

        }
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        System.out.println("--------------------------------------------");

        for (Iterator<Integer> i=list2.iterator();i.hasNext() ;) {
            if(i.next()<4)
                i.remove();
            
        }
        System.out.println(list2);
        System.out.println("--------------------------------------------");
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        list3.removeIf(p->p<4);
        System.out.println(list3);


    }
}
