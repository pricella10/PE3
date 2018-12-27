package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTest {
    Exception exception = null;

    @BeforeClass
    public void setup() {
        // setup methods runs, before every test case runs
        // This method is used to initialize the required variables
        exception = new Exception();

    }

    @AfterClass
    public void teardown() {
        // teardown method runs, after every test case run
        // This method is to clear the initialized variables
        exception = null;

    }

    @Test
    public void testCheckExceptionString() {

    }

    @Test
    public void testCheckCatchClause() {

    }

    @Test
    public void testCheckFinallyClause() {

    }
}