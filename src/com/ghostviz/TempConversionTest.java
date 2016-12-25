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

    @Test
    public void tenCIsFiftyF() {
        assertEquals(50, TempConversion.celsiusToFahrenheit(10), 0.001);
    }

    @Test
    public void tenCIsTwoEightyThreePointOneFiveK() {
        assertEquals(283.15, TempConversion.celsiusToKelvin(10), 0.001);
    }

    @Test
    public void tenCIsFiveOhNinePointSixSevenR() {
        assertEquals(509.67, TempConversion.celsiusToRankine(10), 0.001);
    }

    @Test
    public void tenKIsNegativeFourFortyOnePointSixSevenF() {
        assertEquals(-441.67, TempConversion.kelvinToFahrenheit(10), 0.001);
    }

    @Test
    public void tenKIsNegativeTwoSixtyThreePointOneFiveC() {
        assertEquals(-263.15, TempConversion.kelvinToCelsius(10), 0.001);
    }

    @Test
    public void tenKIs18R() {
        assertEquals(18, TempConversion.kelvinToRankine(10), 0.001);
    }
}
