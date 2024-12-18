package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    // 1 - sum of 2 positive ints should give the expected value
    // 2 - sum of 1 positive and 1 negative int should give the expected value
    // 3 - sum of 2 negative ints should give the expected value
    // 4 - when 1 argument is 0 the sum should remain unaffected
    // 5 - sum of numbers that give a result larger than an int
    // 6 - sum of numbers that give a result smaller than an int
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();

        int result = calculator.add(2,2);
        assertEquals(4, result);

        result = calculator.add(2,-2);
        assertEquals(0, result);

        result = calculator.add(-2,-2);
        assertEquals(-4, result);

        result = calculator.add(0,2);
        assertEquals(2, result);

        result = calculator.add(2,0);
        assertEquals(2, result);

        result = calculator.add(0,-2);
        assertEquals(-2, result);

        result = calculator.add(-2,0);
        assertEquals(-2, result);

        result = calculator.add(Integer.MAX_VALUE,Integer.MAX_VALUE);
        assertEquals(-2, result);

        result = calculator.add(Integer.MIN_VALUE,Integer.MIN_VALUE);
        assertEquals(0, result);


    }

    @Test
    public void testSubtract(){

    }

}