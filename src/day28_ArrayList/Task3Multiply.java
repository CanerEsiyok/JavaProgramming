package day28_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class Task3Multiply {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==1){
                result.add(list.get(i)*2);
                continue;
            }
            result.add(list.get(i));


        }

        System.out.println(result);
    }
}
