package codingdojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzShould {

    public static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    @Test
    public void returnOneForOne() {
        String result = FizzBuzz.compute(1);
        assertEquals("1", result);
    }

    @Test
    public void returnTwoForTwo() {
        String result = FizzBuzz.compute(2);
        assertEquals("2", result);
    }

    @Test
    public void returnFizzForThree() {
        String result = FizzBuzz.compute(3);
        assertEquals(FIZZ, result);
    }

    @Test
    public void returnFizzForSix() {
        String result = FizzBuzz.compute(6);
        assertEquals(FIZZ, result);
    }

    @Test
    public void returnBuzzForFive() {
        String result = FizzBuzz.compute(5);
        assertEquals(BUZZ, result);
    }

    @Test
    public void returnBuzzForTen() {
        String result = FizzBuzz.compute(10);
        assertEquals(BUZZ, result);
    }

}
