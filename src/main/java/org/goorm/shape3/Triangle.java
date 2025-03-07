package org.goorm.shape3;

public class Triangle extends AbstractShape {

    public Triangle(Double width, Double height) {
        super(width, height);
    }

    @Override
    public Double calculateArea() {
        return this.getWidth() * this.getHeight() / 2;
    }
}
