package day24_CustomMethod_Return;

public class RemoveDuplicatedCharacters {
    public static String duplicated(String str){
        String result="";


        for (int i = 0; i <str.length() ; i++) {
            if (!result.contains(""+str.charAt(i)))
                result+=str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str="aaabbccccdddddkkkkkkkkkkkg";
        String son=duplicated(str);
        System.out.println(son);
    }
}
