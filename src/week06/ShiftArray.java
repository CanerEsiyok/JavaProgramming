package week06;

import java.util.Arrays;

public class ShiftArray {
    public static void main(String[] args) {
        int arr[]={17,12,10,8};
        int rev[]=new int[arr.length];
        int a=1;
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1)
                rev[i]=arr[0];
            else
                rev[i]=arr[a++];
        }
        System.out.println(Arrays.toString(rev));
    }
}
