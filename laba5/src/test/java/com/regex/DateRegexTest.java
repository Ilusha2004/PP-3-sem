package com.regex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/** 
 * @author KoVLyA
*/

public class DateRegexTest {

    private DateRegex reg;
    private static String Date_0;
    private static String Date_1;
    private static String Date_2;
    private static String Date_3;
    private static String Date_4;
    private static String Date_5;
    private static String Date_6;
    private static String Date_7;
    private static String Date_8;
    private static String Date_9;
    private static String Date_10;
    private static String Date_11;
    private static String Date_12;
    private static String Date_13;
    private static String Date_14;
    private static String Date_15;
    private static String Date_16;
    private static String Date_17;
    private static String Date_18;
    private static String Date_19;
    private static String Date_20;
    private static String Date_21;
    private static String Date_22;
    private static String Date_23;

    @Before
    public void CreateRegex() throws Exception{

        reg = new DateRegex();
        Date_0 = new String("29/02/0899");
        Date_1 = new String("30/04/0999");
        Date_2 = new String("01/01/0055");
        Date_3 = new String("01/sep/0055");
        Date_4 = new String("30/des/0999");
        Date_5 = new String("29/02/2001");
        Date_6 = new String("30-04-2003");
        Date_7 = new String("1/1/1899");
        Date_8 = new String("30-04-2003");
        Date_9 = new String("29/feb/2004");
        Date_10 = new String("31/jan/1990");
        Date_11 = new String("18/mar/2004");
        Date_12 = new String("67/apr/1456");
        Date_13 = new String("23/may/0204");
        Date_14 = new String("09/jun/1504");
        Date_15 = new String("12/jul/1904");
        Date_16 = new String("16/aug/1604");
        Date_17 = new String("4/sep/14804");
        Date_18 = new String("/oct/2004");
        Date_19 = new String("29/02/0025");
        Date_20 = new String("01/13/1895");
        Date_21 = new String("18/12/2000");
        Date_22 = new String("12/1/209");
        Date_23 = new String("13/09/1991");

    }

    @Test
    public void NotNull(){
        assertNotNull(reg.getDATE_DD_MM_YYYY_SLASH_REG());
    }

    @Test
    public void TestRegex(){
        assertEquals(reg.getDATE_DD_MM_YYYY_SLASH_REG(), "((((0[1-9]|[12][0-9]|3[01])/(0[13578]|1[02]|jan|mar|may|jul|aug|oct|dec))|((0[1-9]|[12][0-9]|30)/(0[469]|11|apr|jun|sep|nov))|((0[1-9]|[1][0-9]|2[0-8])/(02|feb)))/([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3}))|(29/(02|feb)/(([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00)))");
    }
    
    @Test
    public void Test_0(){
        assertFalse(reg.isDate(Date_0));
    }

    @Test
    public void Test_1(){
        assertTrue(reg.isDate(Date_1));
    }

    @Test
    public void Test_2(){
        assertTrue(reg.isDate(Date_2));
    }

    @Test
    public void Test_3(){
        assertTrue(reg.isDate(Date_3));
    }

    @Test
    public void Test_4(){
        assertFalse(reg.isDate(Date_4));
    }

    @Test
    public void Test_5(){
        assertFalse(reg.isDate(Date_5));
    }

    @Test
    public void Test_6(){
        assertFalse(reg.isDate(Date_6));
    }

    @Test
    public void Test_7(){
        assertFalse(reg.isDate(Date_7));
    }

    @Test
    public void Test_8(){
        assertFalse(reg.isDate(Date_8));
    }

    @Test
    public void Test_9(){
        assertTrue(reg.isDate(Date_9));
    }

    @Test
    public void Test_10(){
        assertTrue(reg.isDate(Date_10));
    }

    @Test
    public void Test_11(){
        assertTrue(reg.isDate(Date_11));
    }

    @Test
    public void Test_12(){
        assertFalse(reg.isDate(Date_12));
    }

    @Test
    public void Test_13(){
        assertTrue(reg.isDate(Date_13));
    }

    @Test
    public void Test_14(){
        assertTrue(reg.isDate(Date_14));
    }

    @Test
    public void Test_15(){
        assertTrue(reg.isDate(Date_15));
    }

    @Test
    public void Test_16(){
        assertTrue(reg.isDate(Date_16));
    }

    @Test
    public void Test_17(){
        assertFalse(reg.isDate(Date_17));
    }

    @Test
    public void Test_18(){
        assertFalse(reg.isDate(Date_18));
    }

    @Test
    public void Test_19(){
        assertFalse(reg.isDate(Date_19));
    }

    @Test
    public void Test_20(){
        assertFalse(reg.isDate(Date_20));
    }

    @Test
    public void Test_21(){
        assertTrue(reg.isDate(Date_21));
    }

    @Test
    public void Test_22(){
        assertFalse(reg.isDate(Date_22));
    }

    @Test
    public void Test_23(){
        assertTrue(reg.isDate(Date_23));
    }

}
