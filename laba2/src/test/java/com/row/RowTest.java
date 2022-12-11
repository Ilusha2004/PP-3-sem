package com.row;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RowTest {

    private Row row;

    @Before
    public void setUp() {
        row = new Row(0, 0);
    }

    @Test
    public void testTaylorN10() {
        assertEquals(row.TaylorN10(), 1, 0.0);
    }

    @Test
    public void testGetEps() {
        assertEquals(row.getEps(), 1, 0.0);
    }

    @Test
    public void testGetK() {
        assertEquals(row.getK(), 0, 0.0);
    }

    @Test
    public void testGetX() {
        assertEquals(row.getX(), 0, 0.0);
    }
}
