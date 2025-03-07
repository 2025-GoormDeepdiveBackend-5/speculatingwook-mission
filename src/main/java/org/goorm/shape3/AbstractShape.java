package org.goorm.shape3;

public abstract class AbstractShape {
    private Double width;

    private Double height;

    public AbstractShape(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    public Double calculateArea() {
        return 0.0;
    }
}
