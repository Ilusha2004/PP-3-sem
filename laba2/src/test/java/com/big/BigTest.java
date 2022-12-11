package com.big;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BigTest {

    private Big big;

    @Before
    public void setUp() {
        big = new Big(0, 0);
    }

    @Test
    public void testTaylorN1() {
        assertEquals(big.TaylorN1(big.getX().doubleValue(), (int)big.getK().doubleValue()).doubleValue(), 1, 0.0);
    }

    @Test
    public void testGetEps() {
        assertEquals(big.getEps().doubleValue(), 1.0, 0.0);
    }

    @Test
    public void testGetK() {
        assertEquals(big.getK().doubleValue(), 0.0, 0.0);
    }

    @Test
    public void testGetX() {
        assertEquals(big.getX().doubleValue(), 0.0, 0.0);
    }

}

