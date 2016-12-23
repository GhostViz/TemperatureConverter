package com.ghostviz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GhostViz on 12/23/16.
 */
public class TempConversionTest {
    @Test
    public void negativeFortyFIsNegativeFortyC() {
        assertEquals(-40, TempConversion.fahrenheitToCelsius(-40), 0.001);
    }

    @Test
    public void sixtyFIsTwoEightyEightPointSevenOneK() {
        assertEquals(288.71, TempConversion.fahrenheitToKelvin(60), 0.001);
    }

    @Test
    public void tenFIsFourFiftyNinePointSixSevenR() {
        assertEquals(469.67, TempConversion.fahrenheitToRankine(10), 0.001);
    }
}
