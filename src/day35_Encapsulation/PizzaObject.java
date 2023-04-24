package day35_Encapsulation;

public class PizzaObject {
    public static void main(String[] args) {
        Pizza pizza1=new Pizza("small",3,4);
        System.out.println(pizza1);
        Pizza pizza2=new Pizza("large",3,5);
        System.out.println(pizza2);
    }
}
