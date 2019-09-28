package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InchTest {

    @Test
    void givenZeroInchAndAnotherZeroInch_WhenEquals_ThenShouldReturnEqual() {
        Inch zeroInch = new Inch(0);
        Inch anotherZeroInch = new Inch(0);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndSomethingElse_WhenEquals_ThenShouldNotReturnEqual() {
        Inch oneInch = new Inch(1);

        assertFalse(oneInch.equals(new Object()));
    }

    @Test
    void givenZeroInchAndNull_WhenEquals_ThenShouldNotReturnEqual() {
        Inch oneInch = new Inch(1);

        assertFalse(oneInch.equals(null));
    }

    @Test
    void givenZeroInchAndOneInch_WhenEquals_ThenShouldReturnNotEqual() {
        Inch zeroInch = new Inch(0);
        Inch OneInch = new Inch(1);

        assertFalse(zeroInch.equals(OneInch));
    }
}
