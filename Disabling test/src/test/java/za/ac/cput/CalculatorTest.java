package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    int add,malt;
    @Before
    public void setUp() throws Exception {
        add = calculator.add(5,7);
        malt = calculator.multiply(3,3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        assertEquals(12,add);
    }

    @Ignore
    @Test
    public void multiply() {
        assertEquals(9,malt);
    }
}