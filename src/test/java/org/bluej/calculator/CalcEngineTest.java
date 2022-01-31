package org.bluej.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcEngineTest {

    @Test
    public void testNumberInput() {
        CalcEngine calcEngine = new CalcEngine();

        // Test that user presses the numbers 1, 2 and 3,
        // which should result in displaying the number 123
        calcEngine.numberPressed(1);
        calcEngine.numberPressed(2);
        calcEngine.numberPressed(3);

        // (expected value, value you get)
        assertEquals(123, calcEngine.getDisplayValue());
    }

    @Test
    public void testPlus() {
        CalcEngine calcEngine = new CalcEngine();

        // Input the number 25
        calcEngine.numberPressed(2);
        calcEngine.numberPressed(25);

        calcEngine.plus();

        // Input the number 13
        calcEngine.numberPressed(1);
        calcEngine.numberPressed(3);

        // Calculate result
        calcEngine.equals();

        assertEquals(38, calcEngine.getDisplayValue());
    }
}
