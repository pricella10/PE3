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
