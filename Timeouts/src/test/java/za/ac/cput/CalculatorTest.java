package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    private int add;
    @Before
    public void setUp() throws Exception {
        add = calculator.sum(2,3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 1000)
    public void sum() {
        assertEquals(5,add);
    }
}