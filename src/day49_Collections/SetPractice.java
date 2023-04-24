package day49_Collections;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        String arr[]={"Wooden Spoon","Book","pen","Phone","Wooden Spoon","Paper","Wooden Spoon","Wooden Spoon","Wooden Spoon","Milk"};
      /*  Set<String>list=new HashSet<>(Arrays.asList(arr));
        arr=list.toArray(new String[0]);*/
        arr=new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr));


        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,500,600,10,10,20,30,40,30,20,10));
        list= new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);
       /* ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if(!result.contains(i))
                result.add(i);
        }
        Collections.sort(result);
        System.out.println(result);*/

        Integer[] nums={1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,1,1,2,2,2,3,3,4,7};
       nums=(new LinkedHashSet<>(Arrays.asList(nums))).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[4]);
        System.out.println("**************************************");

        String str="eeaaaabbbbccccdddeeeee";
        String result="";
      /*  for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int i1 = 0; i1 < str.length(); i1++) {
                if(!result.contains(str.charAt(i)+""))
                    result+=str.charAt(i);
                if(str.charAt(i)==str.charAt(i1))
                    count++;
            }

        }*/
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result+=each+Collections.frequency(Arrays.asList(str.split("")),each);
        }




        System.out.println(result);
        System.out.println("-----------------------------------");

        Set<String>names=new LinkedHashSet<>(Arrays.asList("Ahmet","Ahmet","John","James","Breanna","Shay","Ahmet"));
        System.out.println(names.toArray(new String[0])[2]);
        System.out.println(new ArrayList<>(names).get(4));


    }
}
