package day27_WrapperClasses;

public class Retrieve {
    public static void retrieve(String str){
        String letters="";
        String digits="";
        String specialChars="";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                digits+=str.charAt(i);
            else if(Character.isLetter(str.charAt(i)))
                letters+=str.charAt(i);
            else
                specialChars+=str.charAt(i);
        }
        System.out.println("letters= \""+letters+"\"");
        System.out.println("digits= \""+digits+"\"");
        System.out.println("specialChars= \""+specialChars+"\"");

    }

    public static void main(String[] args) {
        String word="Wooden Spoon5!";
        retrieve(word);
    }
}
