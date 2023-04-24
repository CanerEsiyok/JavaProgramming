package day37_Inheritance.phoneTask;

public class Phone {
    public String brand,model,size,color;
    public double price;
    public static boolean hasBattery;


    public Phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        hasBattery=true;
    }
    public void call(long phoneNumber){
        System.out.println(phoneNumber+" is calling");

    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                '}';
    }
}
