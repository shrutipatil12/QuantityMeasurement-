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
            if (otherLength.value == convertToInch(value) && otherLength.unit.equals(Unit.inch)) {
                return true;
            }
            if (value == convertToInch(otherLength) && otherLength.unit.equals(Unit.feet) ) {
                return true;
            }

            return equalsIfUnitsAreSame(otherLength);
        }
        return false;
    }

    private int convertToInch(int other) {
        return other * 12;
    }

    private int convertToInch(Length otherLength) {
        return otherLength.value * 12;
    }

    private boolean equalsIfUnitsAreSame(Length otherLength) {
        return this.value == otherLength.value && this.unit == otherLength.unit;
    }
}