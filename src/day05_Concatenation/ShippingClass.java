package day05_Concatenation;

public class ShippingClass {
    public static void main(String[] args) {
        String name = "Caner Esiyok",
                buildingNumber = "16A",
                streetName = "Pinar mahallesi",
                city = "Adana",
                state = "Akdeniz",
                zipCode = "01160";
        String shippingAdress=name+"\n"+buildingNumber+" "+streetName+"\n"+state+", "+zipCode;
        System.out.println(shippingAdress);
    }
}
