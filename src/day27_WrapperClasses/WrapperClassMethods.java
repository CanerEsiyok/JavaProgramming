package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="123";

        int num=Integer.parseInt(str);
        System.out.println(num+1);
        System.out.println(str+1);

        System.out.println("--------------------------------");

        String str1="10.5";
        double a=Double.parseDouble(str1);
        System.out.println(2+a);

        System.out.println("--------------------------------");

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        long l1=Long.MAX_VALUE;
        long l2=Long.MIN_VALUE;
        System.out.println(l1);
        System.out.println(l2);

        String s1="true";
        boolean bool=Boolean.parseBoolean(s1);
        System.out.println(bool);

        System.out.println("--------------------------------");

        String ss="123";
        Integer x=Integer.valueOf(ss);
        int y=Integer.valueOf(ss);
        System.out.println(x+1);
        System.out.println(y+1);

        String s3="1.5";
        Double z=Double.valueOf(s3);
        System.out.println(z+1);

        //isDigit    isLetter   isSpecialCharacter
        char ch='a';
        boolean b1=Character.isDigit(ch);
        System.out.println(b1);
        boolean b2=Character.isLetter(ch);
        System.out.println(b2);
        boolean b3=!Character.isLetterOrDigit(ch);
        System.out.println(b3);

        //isUpperCase
        boolean b4=Character.isUpperCase(ch);
        System.out.println(b4);
        //isLowerCase
        boolean b5=Character.isLowerCase(ch);
        System.out.println(b5);

        String s2="ab1cde2efg3hi4";
        int total=0;
        for (int i = 0; i < s2.length(); i++) {
            if(Character.isDigit(s2.charAt(i)))
                total+=Integer.parseInt(s2.charAt(i)+"");}
        System.out.println(total);
        }

    }

