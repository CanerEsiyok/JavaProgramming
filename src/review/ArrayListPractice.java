package review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(7);
        nums.add(14);
        nums.add(2);
        System.out.println(nums.size());
        System.out.println(nums);

        System.out.println(nums.get(0));
        nums.set(1,5);
        System.out.println(nums);
        nums.remove(1);
        System.out.println(nums);
        nums.addAll(Arrays.asList(4,5,8));
        System.out.println(nums);
        nums.remove(Integer.valueOf(4));
        System.out.println(nums);
       // nums.clear();
       // System.out.println(nums);
        System.out.println(nums.indexOf(5));
        nums.add(5);
        System.out.println(nums.lastIndexOf(5));
        System.out.println(nums.contains(5));
        System.out.println("------------------------------");

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60));
        boolean contain =list.containsAll(Arrays.asList(20,40,70));
        System.out.println(contain);
        System.out.println("------------------------------");

        list.removeAll(Arrays.asList(20,50));
        System.out.println(list);
        list.retainAll(Arrays.asList(10,30,40));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
