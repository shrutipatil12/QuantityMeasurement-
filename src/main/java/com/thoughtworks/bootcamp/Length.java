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
            Length otherLength = (Length) object;
            if (otherLength.value == TWELVE * value && otherLength.unit.equals(Unit.inch)) {
                return true;
            }

            return this.value == otherLength.value && this.unit == otherLength.unit;
        }
        return false;
    }
}