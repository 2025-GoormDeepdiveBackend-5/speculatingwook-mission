package org.goorm.shape3;

public class Circle implements IShape {
    private final Double diameter;

    public Circle(Double diameter) {
        this.diameter = diameter;
    }

    @Override
    public Double calculateArea() {
        return diameter * diameter * Math.PI / 4;
    }
}
