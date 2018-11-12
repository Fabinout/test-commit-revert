package codingdojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzShould
{
    @Test
    public void returnOneForOne()
    {
        int result  = FizzBuzz.compute(1);
        assertEquals(1,  result );
    }
}
