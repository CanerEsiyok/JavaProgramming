package day30_CustomClass;

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;

    public void setInfo(String carBrand,String carModel,int carYear,String carColor,double carPrice){
        brand=carBrand;
        model=carModel;
        year=carYear;
        color=carColor;
        price=carPrice;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }

    public void start(){
        System.out.println(brand+" "+model+" has started");

    }
    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }
}
