package com.tifone.dailykata.d0610;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighestLowestValueTest {
    HighestLowestValue mResolver;

    @Before
    public void setup() {
        mResolver = new HighestLowestValue();
    }

    @Test
    public void test_values() {
        int [] testResource = new int[] {
                1, 2, 5, -1
        };
        int [] expect = new int[] {-1, 5};
        int[] highestLowest = mResolver.findHighestLowest(testResource);
        assertArrayEquals(expect, highestLowest);

        String testString = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        assertEquals(mResolver.findHighestLowest(testString), "42 -9");
        assertEquals(mResolver.HighAndLow(testString), "42 -9");
    }

}