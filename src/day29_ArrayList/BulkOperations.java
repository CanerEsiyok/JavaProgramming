package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,5,5,5,8,8,8));
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);
        Integer n=1;
      /*  list.remove(n);
        System.out.println(list);*/

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);

        System.out.println("-------------------------------");

        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1=nums.contains(10);
        boolean r2=nums.contains(2) && nums.contains(5) && nums.contains(10);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        boolean r3=nums.containsAll(Arrays.asList(2,15,10));
        System.out.println("r3 = " + r3);

        System.out.println("-------------------------------");

        String[] names={"Josh","Jack","Daniel","Shay","Breanna"};
        ArrayList<String> arr=new ArrayList<>();

    /*    for (String name : names) {
            arr.add(name);
        }*/
      // arr.addAll(Arrays.asList(names));
        ArrayList<String> listNames=new ArrayList<>(Arrays.asList(names));

        //System.out.println(arr);
        System.out.println(listNames);

        System.out.println("-------------------------------");
        Integer[] arr1={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(arr1));
        System.out.println(list2);

        int[] arr2={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3=new ArrayList<>(convertArraytoArrayList(arr2));
        System.out.println(Arrays.toString(arr2));
        System.out.println("list3 = " + list3);





    }
    public static ArrayList<Integer> convertArraytoArrayList(int[] list){
        ArrayList<Integer>result=new ArrayList<>();

        for (int i : list) {
            result.add(i);
        }
        return result;
    }
}
