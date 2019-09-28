package com.thoughtworks.bootcamp;

public class Inch {
    private final int value;

    public Inch(int value) {

        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof Inch && this.value == ((Inch) object).value;

    }

}
