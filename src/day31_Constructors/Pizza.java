package day31_Constructors;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperTopping = numberOfPepperTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperTopping=" + numberOfPepperTopping +
                ", totalPrice=$" + calcCost() +
                '}';
    }

    public double calcCost (){
        double startingPrice=size=='S'? 10:size=='M'?12:14;
        double totalPrice=startingPrice+(numberOfCheeseTopping+numberOfPepperTopping)*2;
        return totalPrice;

    }
}
