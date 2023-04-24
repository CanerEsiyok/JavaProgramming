package day22_MultiDimedsilonalArrays;

public class ReverseTheSecondWord {
    public static void main(String[] args) {
        String str="I love Java";
        String arr[]=str.split(" ");
        String word="";
        for (int i = arr[1].length()-1; i>=0; i--) {
            word += arr[1].charAt(i);
        }
        str=str.replaceFirst(arr[1],word);
        System.out.println(str);

    }
}
