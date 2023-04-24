package day31_Constructors;

public class Carpet {
    public int width,length,unitPrize;
    public boolean isPersian;

    public Carpet(int width, int length, int unitPrize, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrize = unitPrize;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        if(isPersian)
            return width*length*unitPrize+200;
        else
            return width*length*unitPrize;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrize=" + unitPrize +
                ", isPersian=" + isPersian +
                ", totalPrice=" + calcCost() +
                '}';
    }
}
