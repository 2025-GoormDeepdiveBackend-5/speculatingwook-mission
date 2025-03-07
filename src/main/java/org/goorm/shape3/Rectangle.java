package org.goorm.shape3;

public class Rectangle extends AbstractShape {

    public Rectangle(Double width, Double height) {
        super(width, height);
    }

    @Override
    public Double calculateArea() {
        return this.getHeight() * this.getHeight();
    }
}
