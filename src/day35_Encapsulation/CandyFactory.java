package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        ArrayList<CandieTask> candies=new ArrayList<>();
        CandieTask candy1=new CandieTask("Rafaello",5,4.49,false);
        System.out.println(candy1);
        System.out.println(candy1);
        CandieTask candy2=new CandieTask("Nestle",7,7.3,true);
        CandieTask candy3=new CandieTask("Milka",12,5.2,true);
        candies.addAll(Arrays.asList(candy1,candy2,candy3));

        for (CandieTask candy : candies) {
            System.out.println(candy.getBrand()+" : "+candy.getPrice());
        }
    }
}
