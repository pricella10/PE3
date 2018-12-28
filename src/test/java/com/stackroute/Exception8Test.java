package com.stackroute.javape3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exception8Test {


    Exception8 exceptionObj = new Exception8();
    @Test
    public void negativeArray() {
        String expectedValue = "class java.lang.NegativeArraySizeException";
        String actualValue = exceptionObj.negativeArray();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void indexOutOfBoundArray() {
        String expectedValue = "class java.lang.ArrayIndexOutOfBoundsException";
        String actualValue = exceptionObj.indexOutOfBoundArray();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void nullPointerException() {
        String expectedValue = "class java.lang.NullPointerException";
        String actualValue = exceptionObj.nullPointerException();
        assertEquals(expectedValue,actualValue);
    }
}