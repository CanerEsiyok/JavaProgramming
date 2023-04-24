package day35_Encapsulation;

public class Carpet {
    private double width,length;
    private int unitPrice;
    private boolean isPersian;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid entry: "+width);
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0)
            System.exit(0);
        this.length = length;
    }

    public int getUnitPrice() {

        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if(unitPrice<=0)
            System.exit(0);
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public Carpet(double width, double length, int unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }
    public double calcCost(){
        if(isPersian)
            return (width*length)*unitPrice+200;
        return (width*length)*unitPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost=" + calcCost() +
                '}';
    }
}
