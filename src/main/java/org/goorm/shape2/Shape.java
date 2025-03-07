package org.goorm.shape2;

import java.util.ArrayList;
import java.util.List;

/**
 * 도형 인터페이스를 작성하고, 도형의 면적을 계산하는 메서드를 선언합니다.
 * - 도형 인터페이스를 구현한 구체적인 도형 클래스(원, 사각형, 삼각형 등)를 작성합니다.
 * - 도형 인터페이스를 구현한 클래스의 객체를 생성하고, 면적을 계산하여 출력합니다.
 * - 결과물로 도형 인터페이스를 구현한 클래스를 생성하고, 면적을 계산하여 출력하는 스크린샷을 제출합니다.
 */
public class Shape {
    public static void main(String[] args) {
        IShape circle = new Circle(3.4);
        IShape rectangle = new Rectangle(3.3, 5.4);
        IShape triangle = new Triangle(3.3, 3.4);

        List<IShape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        for (IShape shape : shapes) {
            System.out.println("면적: " + shape.calculateArea());
        }
    }
}
