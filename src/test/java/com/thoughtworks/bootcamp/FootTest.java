package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FootTest {
    @Test
    void givenZeroFootAndAnotherZeroFoot_WhenEquals_ThenShouldReturnEqual() {
        Foot zeroFoot = new Foot(0);
        Foot anotherZeroFoot = new Foot(0);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }


    @Test
    void givenOneFoot_WhenEquals_ThenShouldReturnEqual() {
        Foot oneFoot = new Foot(1);
        Foot anotherOneFoot = new Foot(1);


        assertTrue(oneFoot.equals(anotherOneFoot));
    }

    @Test
    void givenZeroFootAndSomethingElse_WhenEquals_ThenShouldNotReturnNotEqual() {
        Foot oneFoot = new Foot(1);

        assertFalse(oneFoot.equals(new Object()));
    }

    @Test
    void givenZeroFootAndNull_WhenEquals_ThenShouldNotReturnNotEqual() {
        Foot oneFoot = new Foot(1);

        assertFalse(oneFoot.equals(null));
    }

    @Test
    void givenZeroFootAndOneInch_WhenEquals_ThenShouldReturnEqual() {
        Foot zeroFoot = new Foot(0);
        Foot OneFoot = new Foot(1);

        assertFalse(zeroFoot.equals(OneFoot));
    }


}
