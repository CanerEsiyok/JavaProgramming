package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean result1=200>40;
        System.out.println("result1 = " + result1);
        boolean result2=300>=150;
        System.out.println("result2 = " + result2);
        boolean result3=100>=100;
        System.out.println("result3 = " + result3);
        int x=100;
        int y=200;
        boolean equal=x==y;
        System.out.println("equal = " + equal);
        boolean result5="Muhtar"=="Good guy";
        System.out.println("result5 = " + result5);
        boolean result6='A'=='a';
        System.out.println("result6 = " + result6);
       if (x!=y){
        System.out.println("yesss"); }
        boolean result7= 100!=200;
        System.out.println("result7 = " + result7);
        boolean result8=100!=100;
        System.out.println("result8 = " + result8);
    }
}
