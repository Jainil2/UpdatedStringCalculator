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
        //two numbers
        assertEquals(3,stringcalculator.add("1,2"));
    }

    @Test
    public void TestCase14() {
        //unknown numbers
        assertEquals(26,stringcalculator.add("1,2,3,5,7,8"));
    }

    @Test
    public void TestCase2() {
        //new line between numbers
        assertEquals(6,stringcalculator.add("1\n2,3"));
    }

    @Test
    public void TestCase3() {
        // Custom delimiter with new lines
        assertEquals(3,stringcalculator.add("//;\n1;2"));
    }

    @Test
    public void TestCase4() {
        //Negative number
        try {
            stringcalculator.add("-1,2");
        } catch (RuntimeException e) {
            assertEquals("Negatives not allowed: [-1]", e.getMessage());
        }
    }

    @Test
    public void TestCase5() {
        //Multiple negative numbers
        try {
            stringcalculator.add("-1,-2,3");
        } catch (RuntimeException e) {
            assertEquals("Negatives not allowed: [-1, -2]", e.getMessage());
        }
    }

    @Test
    public void TestCase6() {
        //Numbers greater than 1000
        assertEquals(2,stringcalculator.add("1001,2"));
    }
}
