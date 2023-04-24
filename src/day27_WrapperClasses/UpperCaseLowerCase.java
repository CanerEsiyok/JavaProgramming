package day27_WrapperClasses;

public class UpperCaseLowerCase {
    public static boolean upperCaseLowerCase(String str){
        int upper=0;
        int lower=0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))
                upper++;
            if(Character.isLowerCase(str.charAt(i)))
                lower++;
        }
        if(upper==lower)
            return true;
        else
            return  false;
    }

    public static void main(String[] args) {
        String str="JAVA java";
        System.out.println(upperCaseLowerCase(str));
    }
}
