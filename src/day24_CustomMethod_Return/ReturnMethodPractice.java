package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static int max(int a,int b){
        int max=0;
        if(a>b)
            max=a;
        else max=b;
        return max;

    }

    public static void main(String[] args) {
        int a=100;
        int b=200;
        int max=max(a,b);
        System.out.println(max);
        System.out.println(max*2);
    }
}
