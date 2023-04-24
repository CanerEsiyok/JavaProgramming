package day22_MultiDimedsilonalArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr2D={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }

        }
    }
}
