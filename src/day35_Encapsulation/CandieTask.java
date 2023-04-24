package day35_Encapsulation;

public class CandieTask {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.err.println("invalid quantity :"+quantity);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.err.println("Invalid price :"+price);
            System.exit(0);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public CandieTask(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String toString() {
        String result="";
        if(price==0)
            result="free";
        else {

            String a= String.valueOf(price);
            result=a;

        }

        return "CandieTask{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" +  result +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
