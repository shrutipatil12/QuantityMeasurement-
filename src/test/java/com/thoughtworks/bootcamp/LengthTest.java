package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void givenZeroFootAndAnotherZeroFoot_WhenEquals_ThenShouldReturnEqual() {
        Length zeroFoot = new Length(0, Length.Unit.feet);
        Length anotherZeroFoot = new Length(0, Length.Unit.feet);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }


    @Test
    void givenOneFootAndAnotherZeroFoot_WhenEquals_ThenShouldReturnNotEqual() {
        Length oneFoot = new Length(1, Length.Unit.feet);
        Length anotherZeroFoot = new Length(0, Length.Unit.feet);


        assertFalse(oneFoot.equals(anotherZeroFoot));
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
    void givenZeroFootAndOneInch_WhenEquals_ThenShouldReturnNotEqual() {
        Length zeroFeet = new Length(0, Length.Unit.feet);
        Length OneInch = new Length(1, Length.Unit.inch);

        assertFalse(zeroFeet.equals(OneInch));
    }


}
