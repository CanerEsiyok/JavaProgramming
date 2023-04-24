package day21_ForEachLoop;

public class CommonElementsTask3 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
        String result="";
        for (int i : arr1) {
            int count=0;
            for (int i1 : arr2) {
                if(i==i1)
                    result+=i+" ";
            }
        }
        System.out.println(result);
    }
}
