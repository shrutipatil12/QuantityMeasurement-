package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {
    @Test
    void givenZeroInchAndAnotherZeroInch_WhenEquals_ThenShouldReturnEqual() {
        Quantity zeroInch = new Quantity(0);
        Quantity anotherZeroInch = new Quantity(0);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInch_WhenEquals_ThenShouldReturnEqual() {
        Quantity zeroInch = new Quantity(0);
        Quantity anotherZeroInch = new Quantity(0);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenOneInch_WhenEquals_ThenShouldReturnEqual() {
        Quantity oneInch = new Quantity(1);
        Quantity anotherOneInch = new Quantity(1);


        assertTrue(oneInch.equals(anotherOneInch));
    }


    @Test
    void givenZeroInchAndSomethingElse_WhenEquals_ThenShouldNotReturnNotEqual() {
        Quantity oneInch = new Quantity(1);

        assertFalse(oneInch.equals(new Object()));
    }

    @Test
    void givenZeroInchAndNull_WhenEquals_ThenShouldNotReturnNotEqual() {
        Quantity oneInch = new Quantity(1);

        assertFalse(oneInch.equals(null));
    }

}
