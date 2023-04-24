package day20_Arrays;

import java.util.Arrays;

public class ReverseTask5 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int reverse[]=new int[5];
        int a=nums.length;
        for (int i = 0; i < nums.length; i++) {
            reverse[i]=nums[a-1];
            a--;
        }

        System.out.println("reversedArray = "+ Arrays.toString(reverse));
    }
}
