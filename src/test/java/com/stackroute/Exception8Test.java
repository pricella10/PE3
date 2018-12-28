package com.stackroute;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exception8Test {

    private Exception8 exceptionObj = new Exception8();

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
        String actualValue = exceptionObj.nullPointerException();
        assertEquals(expectedValue,actualValue);


    }




}

