package review;

public class WrapperClass {
    public static void main(String[] args) {
        String str="123";
        int a=Integer.parseInt(str);
        System.out.println(a+2);

        String str2="1.5";
        double b=Double.valueOf(str2);
        System.out.println(b+1.7);
    }

}
