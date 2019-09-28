package com.thoughtworks.bootcamp;

public class Foot {

    final int value;

    public Foot(int value) {

        this.value = value;
    }

    @Override
    public boolean equals(Object object) {

        return object instanceof Foot && this.value == ((Foot) object).value;
    }

}
