package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyNameTest {

    MyName myName = new MyName();
    String name;
    @Before
    public void setUp() throws Exception {
        name = myName.nameIs("Kaylynn");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void nameIs() {
        String nme = "Sam";
        assertEquals(nme,name);
    }
}