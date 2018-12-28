package com.stackroute.javape3;



import org.junit.After;

import org.junit.Before;

import org.junit.Test;



import java.util.Random;



import static org.junit.Assert.*;



public class LMSException1Test {





    LMSException1 lmsException1;

    @Before

    public void setUp() throws Exception {

    }



    @After

    public void tearDown() throws Exception {

    lmsException1=null;

    }



    @Test

    public void studentMarksOne() {

        int n=10;



        lmsException1=new LMSException1(n);

        int[] marks=new int[n];

        Random random=new Random();

        for(int i=0;i<n;i++){



            marks[i]=random.nextInt(100);

        }





        assertEquals("Marks are between 0 to 100",lmsException1.studentMarks(marks).trim());

    }







    @Test

    public void studentMarksTwo() {

        int n=10;



        lmsException1=new LMSException1(n);

        int[] marks=new int[n];

        Random random=new Random();

        for(int i=0;i<n;i++){



            marks[i]=random.nextInt(100);

        }





        assertNotEquals("Marks should lie between 0 to 100",lmsException1.studentMarks(marks).trim());

    }

}