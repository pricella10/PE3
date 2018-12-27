package com.stackroute;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExceptionTest {

    private Exception exceptionObj = new Exception();

    //NegativeArraySizeException
    @Test
    public void negativeArrayTest(){
        String expectedValue = "class java.lang.NegativeArraySizeException";
        String actualValue = exceptionObj.negativeArray();
        assertEquals(expectedValue,actualValue);


    }

    //IndexOutOfBoundsException


    @Test
    public void indexOutOfBoundArray(){
        String expectedValue = "class java.lang.ArrayIndexOutOfBound";
        String actualValue = exceptionObj.indexOutOfBoundArray();
        assertEquals(expectedValue,actualValue);


    }

//NullPointerException
    @Test
    public void indexOutOfBoundArray(){
        String expectedValue = "class java.lang.NullPointerException";
        String actualValue = exceptionObj.NullPointerException();
        assertEquals(expectedValue,actualValue);


    }




}

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

} f17740e0f5a6afc4010f5aa106f5971526f62865

