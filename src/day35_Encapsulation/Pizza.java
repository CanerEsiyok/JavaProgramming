package day35_Encapsulation;

public class Pizza {
    private String size;
    private int numberOfCheeseToppings, numberOfPepperoniToppings;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))){
            System.err.println("size of the pizza can only be small, medium, large");
            System.exit(0);
        }
        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        if(numberOfCheeseToppings<0){
            System.err.println("number of cheese toppings can not be negative");
            System.exit(0);
        }

        if(size.equalsIgnoreCase("small")) {
            if(numberOfCheeseToppings>3){
                System.err.println("If size is small, it can not be more than 3");
                System.exit(0);
            }
        }
        if(size.equalsIgnoreCase("medium")) {
            if(numberOfCheeseToppings>4){
                System.err.println("If size is medium, it can not be more than 3");
                System.exit(0);
            }
        }
        if(size.equalsIgnoreCase("large")) {
            if(numberOfCheeseToppings>5){
                System.err.println("If size is large, it can not be more than 3");
                System.exit(0);
            }
        }
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        if (numberOfPepperoniToppings<0){
            System.err.println("number of pepperoni toppings can not be negative");
            System.exit(0);
        }
        if(size.equalsIgnoreCase("small")) {
            if(numberOfPepperoniToppings>4){
                System.err.println("If size is small, it can not be more than 4");
                System.exit(0);
            }
        }
        if(size.equalsIgnoreCase("medium")) {
            if(numberOfPepperoniToppings>5){
                System.err.println("If size is small, it can not be more than 5");
                System.exit(0);
            }
        }
        if(size.equalsIgnoreCase("large")) {
            if(numberOfPepperoniToppings>6){
                System.err.println("If size is small, it can not be more than 6");
                System.exit(0);
            }
        }
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public int calcCost(){
        int totalCost=0;
        if(size.equalsIgnoreCase("small"))
            totalCost=  10+2*(numberOfCheeseToppings+numberOfPepperoniToppings);
        else if(size.equalsIgnoreCase("medium"))
            totalCost=12+2*(numberOfCheeseToppings+numberOfPepperoniToppings);
        else
            totalCost=14+2*(numberOfCheeseToppings+numberOfPepperoniToppings);
        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", totalCost=" + calcCost() +
                '}';
    }
}
