package com.CS;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.string.CS.ConvString;

public class ConvStringTest {

    private ConvString convString;

    @BeforeEach
    public void setUp() {
        convString = new ConvString("bab1001a102a3452a10000000000000001a10000000000001000a10001000100", "ab", "10001000100");
    }

    @Test
    void testLengthOfString() {
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matches = pattern.matcher("10001000100");
        int lenght = 0;
        while(matches.find()){
            lenght++;
        }
        assertEquals(lenght, 11);
    }

    @Test
    void testIsNum() {
        assertEquals(ConvString.isNum("10001000100"), true);
    }

    @Test
    void testIsNumeric() {
        assertEquals(ConvString.isNumeric("10001000100"), false);
    }

    @Test
    void testParseInt() {
        assertEquals(convString.parseInt("0111hjfsad100",  10), 32148);
    }

    @Test
    void testFindAllInDualSystem() {
        convString.FindAllInDualSystem();
        assertEquals(Integer.valueOf(convString.getWords().get(2)), 3452);
    }

    @Test
    void testFindAllTokensWithNumbers() {
        convString.FindAllInDualSystem();
        convString.FindAllTokensWithNumbers();
        assertEquals(convString.getArraylist_1().size(), 4);
    }

    @Test
    void testFindNotPalindrome() {
        convString.FindAllInDualSystem();
        convString.FindAllTokensWithNumbers();
        convString.FindPalindrome();
        assertEquals(convString.getPalindromesList().get(1), "10001000100");
    }

    @Test
    void testSortListByAmount() {
        convString.FindAllInDualSystem();
        convString.FindAllTokensWithNumbers();
        convString.FindPalindrome();
        convString.Final();
        convString.SortListByAmount();
        assertEquals(convString.getSortListByAmount().toString(), "[102, 1001, 3452, 10001000100, 10000000000000001, 10000000000001000]");
    }

}