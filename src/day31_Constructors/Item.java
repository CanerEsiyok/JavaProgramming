package day31_Constructors;

public class Item {
    public String name;
    public int unitPrize,quantity;

    public Item(String name, int unitPrize, int quantity) {
        this.name = name;
        this.unitPrize = unitPrize;
        this.quantity = quantity;
    }

    public int calcCost(){
        return unitPrize*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrize=" + unitPrize +
                ", quantity=" + quantity +
                ", totalPrize=" + calcCost() +
                '}';
    }
}
