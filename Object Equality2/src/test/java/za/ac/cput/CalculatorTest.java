package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        int sum = calculator.add(5,7);
        assertEquals(12, sum);
    }

    @Test
    public void diff() {
        int result = calculator.diff(5,13);
        assertEquals(2,result);
    }

    @Test
    public void multiply() {
        int result = calculator.multiply(7,5);
        assertEquals(35,result);
    }

    @Test
    public void mod() {
        int result = calculator.mod(5,13);
        assertEquals(3,result);
    }

    @Test
    public void min() {
        int result = calculator.min(7,15);
        assertEquals(8,result);
    }
}