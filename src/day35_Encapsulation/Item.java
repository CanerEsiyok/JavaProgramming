package day35_Encapsulation;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be empty or blank");
            System.exit(0);
        }
        char[] arr=name.toCharArray();
        for (char c : arr) {
            if(!Character.isLetterOrDigit(c) && c!=' ')   {
                System.err.println("name can not contain any special characters other than space");
                System.exit(0);
            } }
        if(!Character.isLetter(name.charAt(0))){
                System.err.println("name must start with letters");
                System.exit(0);
            }



        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0){
            System.err.println("unitPrice can not be negative");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            System.err.println("quantity can not be negative");
            System.exit(0);
        }
        if(getName().toLowerCase().equals("toilet paper") && quantity>1 ){
            System.err.println("Quantity can not be more than 1");
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + calcCost() +
                '}';
    }
}
