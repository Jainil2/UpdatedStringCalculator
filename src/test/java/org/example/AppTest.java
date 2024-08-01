package org.example;

import org.example.Service.StringCalculator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for StringCalculator App.
 */
public class AppTest {

    private static StringCalculator stringcalculator;

    @BeforeClass
    public static void setup() {
        //setup
        stringcalculator = new StringCalculator();
    }

    @Test
    public void TestCase11() {
        //empty string
        assertEquals(0,stringcalculator.add(""));
    }

    @Test
    public void TestCase12() {
        //single number
        assertEquals(1,stringcalculator.add("1"));
    }

    @Test
    public void TestCase13() {

    }

    @Test
    public void TestCase14() {

    }
}
