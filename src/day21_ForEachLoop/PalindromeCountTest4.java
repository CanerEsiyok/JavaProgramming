package day21_ForEachLoop;

public class PalindromeCountTest4 {
    public static void main(String[] args) {
        String[] str={"level","anna","Java"};
        int count=0;
        for (String s : str) {
            String result="";
            for (int i = s.length() - 1; i >= 0; i--) {
                result+=s.charAt(i);
            }
            if(s.equals(result))
                count++;
        }
        System.out.println(count);
    }
}
