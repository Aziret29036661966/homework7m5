package com.example.homework7m5;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    private Math math;

    @Before
    public void setUp(){
        math = new Math();
    }

    @Test
    public void simpleAdd(){
        assertEquals("4", math.add("2", "2"));
    }

    @Test
    public void addWithDots(){
        assertEquals("You're gay? Don't write dots!!!", math.add("2", "2......"));
    }

    @Test
    public void addWithSpace(){
        assertEquals("You're gay? Don't push space!!!", math.add("2", "2      "));
    }

    @Test
    public void addWithLetters(){
        assertEquals("You're gay? Don't write letters!!!", math.add("2", "2afgfdpgsdmkf"));
    }

    @Test
    public void addWithMinus(){
        assertEquals("You're gay? Don't write minus!!!", math.add("2", "-2"));
    }

    @Test
    public void addWithNull(){
        assertEquals("You're gay? Don't write null", math.add("2", null));
    }

    @Test
    public void addWithEmpty(){
        assertEquals("You're gay? String is Empty", math.add("2", ""));
    }


    @After
    public void detach(){
        math = null;
}
}
