package day42_Exceptions;

public class MorningWorkout {
    public static void main(String[] args)  {
        System.out.println("Push up started");
        int n=1;
        for (int i = 0; i <= 30; i++) {


            System.out.print("\rpush up "+n++);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\nPush up completed");
    }
}
