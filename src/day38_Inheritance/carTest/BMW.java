package day38_Inheritance.carTest;

public class BMW extends Car{
    public BMW( String model, String color, int year, int miles, double price) {
        super("BMW", model, color, year, miles, price);
    }
    public void breaksDown(){
        System.out.printf(brand+" "+model+ " is breaking down");
    }
    

}
