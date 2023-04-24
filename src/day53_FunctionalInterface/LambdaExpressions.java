package day53_FunctionalInterface;

public class LambdaExpressions {
    public static void main(String[] args) {
        MyThirdFunctionalInterface<String> stringReverse=n -> {
            String result=new StringBuilder(n).reverse().toString();
         /*   String result="";
            for (int i = n.length()-1; i >= 0; i--) {
                result+=n.charAt(i);
            }*/
            return result;
        };

        System.out.println(stringReverse.method("Caner"));

        MyThirdFunctionalInterface<Integer> cube=n -> {
            return n*n*n;
        };
        System.out.println(cube.method(5));
    }

}
