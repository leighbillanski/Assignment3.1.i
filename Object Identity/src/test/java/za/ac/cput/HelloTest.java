package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    private String hi, name, surname;
    Hello hello = new Hello();
    @Before
    public void setUp() throws Exception {

        hi = hello.greet("Hello");
        name = hello.name("Kaylynn");
        surname = hello.surname("Johnson");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void greet() {
        String str = "Hello";
        assertSame(str, hi);
    }

    @Test
    public void name() {
        String str = "Kaylynn";
        assertSame(str,name);
    }

    @Test
    public void surname() {
        String str = "Johnson";
        assertSame(str,surname);
    }


}