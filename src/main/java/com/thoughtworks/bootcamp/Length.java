package com.thoughtworks.bootcamp;


public class Length {

    private double value;
    private Unit unit;
    private static final int TWELVE = 12;

    enum Unit {
        feet(12), inch(1), cm(1 / 2.54);
        private final double converter;

        Unit(double converter) {
            this.converter = converter;
        }

        public double convertToBase(double value) {

            return value * converter;
        }
    }

    public Length(double value, Unit unit) {
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

            return Math.abs(this.unit.convertToBase(this.value) - otherLength.unit.convertToBase(otherLength.value)) <= 0.01;

        }
        return false;
    }

}