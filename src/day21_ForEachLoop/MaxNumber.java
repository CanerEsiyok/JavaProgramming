package day21_ForEachLoop;

public class MaxNumber {public static void main(String[] args) {
    int num[]={10,5,4,20,1,0};
    int max=0;
    for(int each:num){
        if(each>max)
            max=each;

    }
    System.out.println(max);
}
}

