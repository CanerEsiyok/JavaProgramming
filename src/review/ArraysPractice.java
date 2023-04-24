package review;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        String[] names={"Caner","Ece","Emine"};
        System.out.println(Arrays.toString(names));

        System.out.println("--------------------------");

        int[] numbers={4,5,6,7,1,10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("--------------------------");

        char[] ch1={'c','b','a'};
        char[] ch2={'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        Boolean equal=Arrays.equals(ch1,ch2);
        System.out.println(equal);
        System.out.println("--------------------------");

        int[] arr=new int[5];
        arr[0]=12;arr[1]=22;arr[2]=32;arr[3]=42;arr[4]=62;
        int[] arr2=Arrays.copyOf(arr,3);
        int[] arr3=Arrays.copyOfRange(arr,1,4);

        System.out.println(Arrays.toString(arr3));
        System.out.println("--------------------------");

        int[] list={10,20,30,40,50};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("--------------------------");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }

        int[] nums={10,20,30,40,50,60,70,80,90};
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
