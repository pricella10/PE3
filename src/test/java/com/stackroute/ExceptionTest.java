package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionPracticeTest {
    Exception exception = null;

    @Before
    public void setUp() throws Exception {
        exception = new Exception("ARRAY INDEX OUT OF BOUND exception");
    }

    @After
    public void tearDown() throws Exception {
        exception = null;
    }

    @Test
    public void testMain1(){

        assertEquals("true", exception.main(new int[]{12,23,34,45});
    }

    @Test
    public void testMain2(){

        assertEquals("false", exception.main(new int[]{12,23,34,45});
    }
}
