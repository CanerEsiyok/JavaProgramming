package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50,60};
        int sum=0;
        for (int i : num) {
            sum+=i;
        }
        System.out.println((double) sum/num.length);
    }
}
