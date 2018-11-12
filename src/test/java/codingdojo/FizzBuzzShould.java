package codingdojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzShould
{
    @Test
    public void returnOneForOne()
    {
        String result  = FizzBuzz.compute(1);
        assertEquals("1",  result );
    }

    @Test
    public void returnTwoForTwo()
    {
        String result  = FizzBuzz.compute(2);
        assertEquals("2",  result );
    }

    @Test
    public void returnFizzForThree()
    {
        String result  = FizzBuzz.compute(3);
        assertEquals("Fizz",  result );
    }

}
