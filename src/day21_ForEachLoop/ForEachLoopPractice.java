package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] words={"Java Programming","Cydeo School","Wooden Spoon","Early Birds","Angry Birds"};
        String result="";
        for (String word : words) {
            result=word.substring(0,1)+word.substring(word.length()-1);
            System.out.println(result);
        }
    }
}
