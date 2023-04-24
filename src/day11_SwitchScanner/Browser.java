package day11_SwitchScanner;
import java.util.*;

public class Browser {
    public static void main(String[] args) {

        String browserName= "Firefox";
        String invalid="Invalid";
        String b=(browserName=="Chrome"||browserName=="Firefox"||browserName=="Opera"||browserName=="Safari"||browserName=="Edge")?browserName:invalid;
        System.out.println(b);
    }
}
