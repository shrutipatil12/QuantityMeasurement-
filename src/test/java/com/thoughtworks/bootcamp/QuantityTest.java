package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {
    @Test
    void givenZeroFeet_WhenCompare_ThenShouldReturnZeroInch() {
        Quantity quantity = new Quantity();
        assertEquals(0, quantity.compare());
    }

}
