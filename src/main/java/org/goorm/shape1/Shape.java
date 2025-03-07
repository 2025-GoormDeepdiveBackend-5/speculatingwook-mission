package org.goorm.shape1;

import java.util.ArrayList;
import java.util.List;

/**
 * 도형 클래스를 작성하고, 도형의 종류와 면적을 저장하는 멤버 변수를 가집니다.
 * 다양한 도형 객체(원, 사각형, 삼각형 등)를 생성하고 도형 배열에 저장합니다.
 * 도형 배열의 각 도형 객체에 대해 면적을 계산하여 출력합니다.
 * 결과물로 다양한 도형 객체를 생성하고 배열에 저장한 뒤, 각 도형의 면적을 출력하는 스크린샷을 제출합니다.
 */
public class Shape {
    private final Type type;
    private final Double area;

    public Shape(Type type, Double area) {
        this.type = type;
        this.area = area;
    }

    public Type getType() {
        return type;
    }

    public Double getArea() {
        return area;
    }

    public static void main(String[] args) {
        Shape circle = new Shape(Type.CIRCLE, 15.34);
        Shape triangle = new Shape(Type.TRIANGLE, 13.0);
        Shape rectangle = new Shape(Type.RECTANGLE, 10.0);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            System.out.println("도형 종류: " + shape.getType().toString());
            System.out.println("도형 면적: " + shape.getArea());
        }
    }
}
