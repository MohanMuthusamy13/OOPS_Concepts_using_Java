package ExceptionHandling;
import java.util.SplittableRandom;

class ExceptionHandlingclass {
    private String s;
    private int i;

    public void setString(String str) {
        this.s = str;
    }
    public String getString() {
        return s;
    }

    public void convert(String str) {
        try {
            i = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            System.out.println("You cant convert a string to int! :)");
        }
        finally {
            System.out.println("Done :)");
        }
    }

    public void eligibility(int age) {
        if (age < 18) {
            throw new NumberFormatException("You are not eligible");
        }
        else {
            System.out.println("You can vote :)");
        }
    }

    public void funException() throws Exception{
        throw new Exception("Sorry AE encountering!");
//        System.out.println("fjhvdfj");
    }

    public int funny() {
        return 500/0;
    }

}

class SubExceptionHandling extends ExceptionHandlingclass{
    public void funException() throws ArithmeticException{
        try {
            funny();
        }
        catch (Exception e) {
            System.out.println(e);
            throw new NullPointerException("sdWD");
        }
    }
}
public class ExceptionHandling {
    public static void main(String[] args) throws NullPointerException{
        SubExceptionHandling ex = new SubExceptionHandling();
        try {
            ex.funException();
        }
        catch (ArithmeticException ae) {
            System.out.println("There is an exception everywhere ! :)");
        }
        catch (RuntimeException e) {
            System.out.println("Yayyy! This is runtime exception");
        }
    }
}

