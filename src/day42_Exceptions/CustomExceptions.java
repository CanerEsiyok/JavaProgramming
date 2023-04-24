package day42_Exceptions;

class FadyException extends RuntimeException{ //custom unchecked exception
    public FadyException(){
        System.out.println("Time for a short break");
    }
    public FadyException(String message){
        super(message);
    }
}
class NoBreakException extends Exception{ //custom checked exception

}
public class CustomExceptions {

    public static void main(String[] args) {
       // throw new FadyException("Time for break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            throw new RuntimeException(e);
        }

    }
}
