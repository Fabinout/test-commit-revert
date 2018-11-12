package codingdojo;

public class FizzBuzz {

    public final static String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String compute(int input) {
        if (input == 5) {
            return BUZZ;
        }
        if (input % 3 == 0) {
            return FIZZ;
        }
        return String.valueOf(input);
    }
}
