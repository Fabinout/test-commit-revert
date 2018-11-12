package codingdojo;

public class FizzBuzz {

    public final static String FIZZ = "Fizz";

    public static final int SIX = 3;

    public static String compute(int input) {
        if(input == 3 || input == SIX ) {
            return FIZZ;
        }
        return String.valueOf(input);
    }
}
