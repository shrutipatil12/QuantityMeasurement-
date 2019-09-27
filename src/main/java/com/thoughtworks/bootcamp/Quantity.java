package com.thoughtworks.bootcamp;

public class Quantity {

    final int value;

    public Quantity(int value) {
        this.value = value;

    }

    public boolean compare(Quantity quantity) {
        return (this.value == quantity.value);
    }
}
