package day37_Inheritance.phoneTask;

public final class IPhone extends  Phone{
    public IPhone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }
    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+" is faceTiming");
    }
}

