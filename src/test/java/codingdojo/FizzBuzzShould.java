package codingdojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzBuzzShould
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void returnOneForOne()
    {
        int result  = FizzBuzz.compute(1);
        assertEquals(1,  result );
    }
}
