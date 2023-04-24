package day20_Arrays;

public class MayNumberOfArray {
    public static void main(String[] args) {
        int num[]={10,5,4,20,1,0};
        int max=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max=num[i];
            }

        }
        System.out.println(max);
    }
}
