package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String word="AAABBBC";
        String result="";

        int len=word.length();
        for (int i = 0; i < len; i++) {
            if(result.contains(""+word.charAt(i)))
                continue;
            result+=word.charAt(i);


        }
        System.out.println(result);
    }
}
