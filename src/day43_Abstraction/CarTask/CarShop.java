package day43_Abstraction.CarTask;

public class CarShop {
    public static void main(String[] args) {
        Honda car1=new Honda("accent","Blue",2014,10000);
        Audi car2=new Audi("a5","White",2017,12000);
        Tesla car3=new Tesla("x","Black",2020,140250);

        car1.setColor("Red");
        
    }
}
