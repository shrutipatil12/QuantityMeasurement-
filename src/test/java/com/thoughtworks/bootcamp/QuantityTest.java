package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {
    @Test
    void givenZeroFeet_WhenCompare_ThenShouldReturnSame() {
        Quantity zeroFeet = new Quantity(0);

        assertTrue(zeroFeet.compare(zeroFeet));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldReturnSame() {
        Quantity zeroInch = new Quantity(0);

        assertTrue(zeroInch.compare(zeroInch));
    }
}
