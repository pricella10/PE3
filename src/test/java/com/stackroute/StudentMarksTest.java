package com.stackroute;
import org.junit.Test;
<<<<<<< HEAD
=======


import static org.junit.Assert.*;public class StudentMarksTest {    StudentMarks marks = new StudentMarks();    @Test

>>>>>>> fe3358710222553666b55a452d321bf1929d1ad9
import static org.junit.Assert.*;
public class StudentMarksTest {
    StudentMarks marks = new StudentMarks();
    @Test
<<<<<<< HEAD
=======


import static org.junit.Assert.*;public class StudentMarksTest {    StudentMarks marks = new StudentMarks();    @Test

>>>>>>> fe3358710222553666b55a452d321bf1929d1ad9
public void test1() {
    assertEquals("Grade should lie between 0 to 100",true, StudentMarks.studentmarks(00));
}
@Test
public void test2() {
    assertEquals(  "grade should lie between 0 to 100", false, StudentMarks.studentmarks(150));
}
@Test
public void test3() {
    assertNotEquals("grade should be equal to 0 to 100", true, StudentMarks.studentmarks(400));
}
@Test
public void test4() {


    assertNotEquals("grade should lie between 0 to 100",StudentMarks.studentmarks(87));
}
}

    assertNull("grade should lie between 0 to 100",StudentMarks.studentmarks(87));
}
}


    assertNotEquals("grade should lie between 0 to 100",StudentMarks.studentmarks(87));
}
}

