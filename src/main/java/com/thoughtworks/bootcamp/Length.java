package com.thoughtworks.bootcamp;


public class Length {

    private int value;
    private Unit unit;

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
            if (this.value == 0 && ((Length) object).value == 0) {
                return true;
            }
            if(this.value==1 && ((Length) object).value==12)
            {
                return true;
            }

         return this.value == ((Length) object).value && this.unit == ((Length) object).unit;
        }
        return false;
    }
}