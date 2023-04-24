package day15_ForLoops;

public class Task1SumOfTheEvenNumbers {
    public static void main(String[] args) {

        int total=0;
        for (int i = 0; i <= 100; i++) {
            if(i%2==0)
                total+=i;

            
        }
        System.out.println(total);

        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0)
                sum+=i;

        }
        System.out.println(sum);
    }
}
