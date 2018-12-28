<<<<<<< HEAD
package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;
public class DateofaweekTest {
    Dateofaweek d = new Dateofaweek();
    @Test
    public void caltest() {
        assertEquals("First day of week : Monday 24/12/2018 Last day of week : 30/12/2018", d.calender("dd/MM/YYYY"));
    }
    @Test
=======


import org.junit.Test;
import static org.junit.Assert.*;public class DateofaweekTest {

package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateofaweekTest {

package com.stackroute;import org.junit.Test;
import static org.junit.Assert.*;public class DateofaweekTest {

    Dateofaweek d = new Dateofaweek();    @Test
    public void caltest() {
        assertEquals("First day of week : Monday 24/12/2018 Last day of week : Sunday 30/12/2018", d.calender("dd/MM/YYYY"));
    }    @Test
>>>>>>> fe3358710222553666b55a452d321bf1929d1ad9
    public void caltest1() {
        assertNotEquals("Last day of week : Monday 24/12/2015 Last day of week : Sunday 30/12/2015",d.calender("dd/mm/yyyy"));
    }
}