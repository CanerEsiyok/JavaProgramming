package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,5));
        ArrayList<Integer> result=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int count=0;
            for (int i1 = 0; i1 < list.size(); i1++) {
                if(list.get(i)==list.get(i1))
                    count++;
            }
            if(count==1){
                System.out.println("The first unique element= "+list.get(i));
                break;
            }

        }
    }
}
