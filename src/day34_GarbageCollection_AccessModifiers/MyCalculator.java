package day34_GarbageCollection_AccessModifiers;

public class MyCalculator {
    public int n1,n2;

    public MyCalculator(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void plus(){
        System.out.println(n1+n2);
    }
    public void minus(){
        System.out.println(n1-n2);
    }
    public void multiply(){
        System.out.println(n1*n2);
    }
    public void divide(){
        System.out.println((float) n1/n2);
    }

    public String toString() {
        return "MyCalculator{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                '}';
    }
}
class MyCalculatorObjects {
    public static void main(String[] args) {
        MyCalculator cal1 = new MyCalculator(6, 8);
        cal1.plus();
        cal1.minus();
        cal1.divide();
        cal1.multiply();
    }
}