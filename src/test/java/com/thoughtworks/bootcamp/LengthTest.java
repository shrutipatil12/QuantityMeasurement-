package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void givenZeroFeettAndAnotherZeroFeet_WhenEquals_ThenShouldReturnEqual() {
        Length zeroFeet = new Length(0, Length.Unit.feet);
        Length anotherZeroFeet = new Length(0, Length.Unit.feet);

        assertTrue(zeroFeet.equals(anotherZeroFeet));
    }


    @Test
    void givenOneFeetAndAnotherZeroFeet_WhenEquals_ThenShouldReturnNotEqual() {
        Length oneFeet = new Length(1, Length.Unit.feet);
        Length anotherZeroFoot = new Length(0, Length.Unit.feet);


        assertFalse(oneFeet.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndSomethingElse_WhenEquals_ThenShouldNotReturnEqual() {
        Length oneFoot = new Length(1, Length.Unit.feet);

        assertFalse(oneFoot.equals(new Object()));
    }

    @Test
    void givenZeroAndNull_WhenEquals_ThenShouldReturnNotEqual() {
        Length oneFoot = new Length(1, Length.Unit.feet);

        assertFalse(oneFoot.equals(null));
    }

    @Test
    void givenZeroInchAndSomethingElse_WhenEquals_ThenShouldReturnNotEqual() {
        Length oneInch = new Length(1, Length.Unit.inch);

        assertFalse(oneInch.equals(new Object()));
    }

    @Test
    void givenZeroIntAndNull_WhenEquals_ThenShouldReturnNotEqual() {
        Length oneInch = new Length(1, Length.Unit.inch);

        assertFalse(oneInch.equals(null));
    }

    @Test
    void givenZeroFeetAndZeroInch_WhenEquals_ThenShouldReturnEqual() {

        Length zeroFeet = new Length(0, Length.Unit.feet);
        Length zeroInch = new Length(0, Length.Unit.inch);

        assertTrue(zeroFeet.equals(zeroInch));
    }

    @Test
    void givenZeroFeetAndOneInch_WhenEquals_ThenShouldReturnNotEqual() {
        Length zeroFeet = new Length(0, Length.Unit.feet);
        Length OneInch = new Length(1, Length.Unit.inch);

        assertFalse(zeroFeet.equals(OneInch));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldReturnEqual() {
        Length oneFeet = new Length(1, Length.Unit.feet);
        Length twelveInch = new Length(12, Length.Unit.inch);

        assertTrue(oneFeet.equals(twelveInch));
    }

    @Test
    void givenTwelveInchAndOneFeet_WhenEquals_TheyShouldBeEqual() {
        Length oneFeet = new Length(1.0, Length.Unit.inch);
        Length twelveInch = new Length(2.54, Length.Unit.cm);

        assertTrue(oneFeet.equals(twelveInch));
    }

    @Test
    void givenTwoFiftyFourCM_WhenConvertsToInch_ThenItShouldConvert() {

        assertEquals(1, Length.Unit.cm.convertToBase(2.54), 0.01);
    }

    @Test
    void givenOneFeet_WhenConvertsToInch_ThenItShouldConvert() {

        assertEquals(12, Length.Unit.feet.convertToBase(1));
    }

    @Test
    void givenOneInch_WhenConvertsToInch_ThenItShouldConvert() {

        assertEquals(1, Length.Unit.inch.convertToBase(1));
    }
}
