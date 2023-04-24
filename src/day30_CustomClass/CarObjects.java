package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setInfo("Bmw","1.16d",2020,"Black",23000);
        System.out.println(car1);

        Car car2=new Car();
        car2.setInfo("Audi","a5",2018,"White",27500);
        System.out.println(car2);

        Car car3=new Car();
        car3.setInfo("Hyundai","i20",2014,"White",41000);
        System.out.println(car3);

      //  Car[] cars={car1,car2,car3};
        ArrayList<Car> list=new ArrayList<>(Arrays.asList());
        list.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(list);

        for (Car each : list) {
            System.out.println(each.brand+" : "+each.price);
        }

        System.out.println("----------------------------------------------");

        list.removeIf(p-> p.brand.equals("Bmw") && p.year>=2005 && p.year<=2010);
        list.removeIf(p-> p.brand.equals("Hyundai")&& p.year>=1995 && p.year<=1998);


    }
}
