package day20_Arrays;

public class CommonElementsTask7 {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2={4,5,6,7,8};

        for (int i = 0; i < a1.length; i++) {
            int com=0;
            for (int j = 0; j < a1.length; j++) {
                if (a1[i]==a2[j]){
                    System.out.print(a1[i]+" ");
                }

            }
        }
    }
}
