package day37_Inheritance.phoneTask;

public class Samsung extends  Phone{
    public Samsung( String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }
    public void freeze(){
        System.out.println(model+" is freezing");
    }
}
