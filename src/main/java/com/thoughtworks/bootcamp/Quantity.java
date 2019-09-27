package com.thoughtworks.bootcamp;

public class Quantity {

    final int value;


    public Quantity(int value) {
        this.value = value;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quantity)) return false;
        Quantity quantity = (Quantity) o;
        return value == quantity.value;
    }

}
