package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {
    @Test
    void givenZeroFeet_WhenEquals_ThenShouldReturnEqual() {
        Quantity zeroFeet = new Quantity(0);

        assertTrue(zeroFeet.equals(zeroFeet));
    }

    @Test
    void givenZeroInch_WhenEquals_ThenShouldReturnEqual() {
        Quantity zeroInch = new Quantity(0);

        assertTrue(zeroInch.equals(zeroInch));
    }
    @Test
    void givenOneInch_WhenEquals_ThenShouldReturnEqual() {
        Quantity oneInch = new Quantity(1);

        assertTrue(oneInch.equals(oneInch));
    }

    @Test
    void givenZeroFeetAndOneInch_WhenEquals_ThenShouldNotReturnNotEqual() {
        Quantity oneInch = new Quantity(1);
        Quantity twoInch = new Quantity(2);

        assertFalse(oneInch.equals(twoInch));
    }

}
