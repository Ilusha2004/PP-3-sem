package com.form;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FormTest {

    private BigDecimal bigDecimal;
    public Format formatForm;

    @BeforeAll
    public void steUp() {
        bigDecimal = new BigDecimal(12.46758);
        formatForm = new Format();
    }
 
    @Test
    void testEightDigits() {
        assertEquals(formatForm.EightDigits(bigDecimal, 3), "12.357");
    }

    @Test
    void testFloat() {
        assertEquals(formatForm.Float(bigDecimal), "Float formatting: 12,467580");
    }

    @Test
    void testHEX() {
        assertEquals(formatForm.HEX(bigDecimal), "HEX formatting: 0x1.8ef66a5508701p3");
    }

    @Test
    void testMinWidht() {
        assertEquals(formatForm.MinWidht(bigDecimal), "Widht formatting: 0000000000012,467580");
    }

    @Test
    void testOCTA() {
        assertEquals(formatForm.OCTA(bigDecimal, 0), "OCTA formatting: 14.0");
    }

    @Test
    void testPorArgument() {
        assertEquals(formatForm.PorArgument(bigDecimal),
         "Position number argument formatting: First argument: 12,000000 and second: 0,467580");
    }

    @Test
    void testPositiveAndNegative() {
        assertEquals(formatForm.PositiveAndNegative(bigDecimal), "+ and - formatting: +12,467580 and -12,467580");
    }

    @Test
    void testSetPrecition() {
        assertEquals(formatForm.SetPrecition(bigDecimal, 0), "Precition formatting: 12");
    }

    @Test
    void testSixteenDigits() {
        assertEquals(formatForm.SixteenDigits(bigDecimal, 10), "0x12.77B352A843");
    }

    @Test
    void testSkobki() throws Exception {
        assertEquals(formatForm.Skobki(bigDecimal), "Negative formatting: 12,467580");
    }

    @Test
    void testZapyataya() {
        assertEquals(formatForm.Zapyataya(bigDecimal), "Point formatting: 12,47");
    }
    
}
