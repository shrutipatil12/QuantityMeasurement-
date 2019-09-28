package com.thoughtworks.bootcamp;

public class Inch {
    private int value;

    public Inch(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {

        return object instanceof Foot && this.value == ((Foot) object).value;
    }

}
