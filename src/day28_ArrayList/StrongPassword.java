package day28_ArrayList;

public class StrongPassword {
    public static void strongPassword(String password){
        int upper=0;
        int lower=0;
        int specialChars=0;
        int digit=0;
       boolean r1=password.length()>=8 && !password.contains(" ");
        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i)))
                upper++;
            if(Character.isLowerCase(password.charAt(i)))
                lower++;
            if(!Character.isLetterOrDigit(password.charAt(i)))
                specialChars++;
            if(Character.isDigit(password.charAt(i)))
                digit++;
        }
        boolean r2=upper>=1 && lower>=1 && specialChars>=1 && digit>=1;
        if(r1 && r2)
            System.out.println("Strong password");
        else
            System.err.println("Weak password");
    }

    public static void main(String[] args) {
        String str="Cydeo1990@";
        strongPassword(str);
    }
}
