package org.goorm.shape2;


public class Triangle implements IShape{
    private final Double width;
    private final Double height;

    public Triangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return width * height / 2;
    }
}
