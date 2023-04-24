package day38_Inheritance.carTest;

public class CarObject {
    public static void main(String[] args) {
        Toyota car1=new Toyota("Corolla","Blue",2018,10000,14200);
        car1.start();
        System.out.println(car1.price);
        System.out.println(car1);

        Tesla car2=new Tesla("x","Black",14,22,5);
        car2.start();
    }
}
