package com.seniorzhai.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zhai on 16/3/9.
 */
public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void testSum() throws Exception {
        Assert.assertEquals(9, calculator.sum(2, 3));
    }
}