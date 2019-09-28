package com.thoughtworks.bootcamp;


public class Length {

    private int value;
    private Unit unit;
    private static final int TWELVE = 12;

    enum Unit {
        feet, inch;
    }

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Length) {
            if (((Length) object).value == TWELVE * value) {
                return true;
            }

            return this.value == ((Length) object).value && this.unit == ((Length) object).unit;
        }
        return false;
    }
}