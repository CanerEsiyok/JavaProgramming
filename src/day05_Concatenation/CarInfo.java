package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        String year="2014",
                make="Hyundai",
                model="i20",
                miles="14000",
                color="White",
                price="41000";
        String car=year+" "+make+" "+model+", "+miles+" miles, "+color+", "+"€"+price+".";
        System.out.println(car);
    }
}
