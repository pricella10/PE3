package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTest {
    Exception exception = null;

    @BeforeClass
    public void setup() throws java.lang.Exception
    {
        // setup methods runs, before every test case runs
        // This method is used to initialize the required variables
        exception = new Exception();

    }

    @AfterClass
    public void teardown() throws java.lang.Exception
    {
        // teardown method runs, after every test case run
        // This method is to clear the initialized variables
        exception = null;

    }

    @Test
    public void testCheckExceptionString1() {

        String[] str={"Hello Check it"};
        assertEquals("",);
    }

    @Test
    public void testCheckCatchClause2() {

        String[] str={""};
        assertEquals("",);
    }

    @Test
    public void testCheckFinallyClause3() {

        String[] str={""};
        assertEquals("",);
    }

}


//public class SimpleException {
//    public static void main(String args[]) {
//        try {
//            throw new Exception("An exception in main");
//        } catch(Exception e) {
//            System.out.println(
//                    "e.getMessage() = " + e.getMessage());
//        } finally {
//            System.out.println("In finally clause");
//        }
//    }
//}
