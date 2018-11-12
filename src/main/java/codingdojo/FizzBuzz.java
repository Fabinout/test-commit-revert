package codingdojo;

public class FizzBuzz {

    public final static String FIZZ = "Fizz";

    public static String compute(int input) {
        if(input == 3 || input == 0 ) {
            return FIZZ;
        }
        return String.valueOf(input);
    }
}
