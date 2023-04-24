package day53_FunctionalInterface;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
       list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);

        int[] arr1={1,1,2,2,3,3,4,4,5,5,6,6};
       arr1= Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr1));

        List<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2=list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2);

        int[] num={1,2,3,4,5,6,7,8,9,10};
        num = Arrays.stream(num).skip(4).toArray();
        System.out.println(Arrays.toString(num));
        List<Integer>list3=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        System.out.println(list3.stream().limit(7).collect(Collectors.toList()));
        System.out.println("--------------------------------------------------");
        List<Integer>list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list4.stream().map(p -> p * 10).collect(Collectors.toList()));
        List<String>days=new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        System.out.println(days.stream().map(p -> p.substring(0, 3)).collect(Collectors.toList()));

        List<Integer>list5=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer>even=list5.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(even);

        List<String>names=new ArrayList<>(Arrays.asList("Java","java","jAvA","Python","Ruby"));
        long javaCount = names.stream().filter(p -> p.equalsIgnoreCase("java")).count();
        System.out.println(javaCount);

        List<Integer>list6=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list6.stream().allMatch(p -> p % 2 == 0));
        System.out.println(list6.stream().anyMatch(p -> p > 9));
        System.out.println(list6.stream().noneMatch(p -> p % 3 == 0));
    }
}
