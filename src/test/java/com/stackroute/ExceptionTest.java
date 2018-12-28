package com.stackroute;
<<<<<<< HEAD
import org.junit.After;
import org.junit.Before;
=======


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
>>>>>>> fe3358710222553666b55a452d321bf1929d1ad9
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
<<<<<<< HEAD
}
=======


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

>>>>>>> fe3358710222553666b55a452d321bf1929d1ad9
