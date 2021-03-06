package codingdojo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzShouldTest {

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
//    @DisplayName("1 + 0 = 1")
    public void shoulReturn() {
        assertEquals(1, 1);
    }
}
