package org.goorm;

/**
 * 직사각형의 길이와 너비를 저장하는 멤버 변수를 가진 직사각형 클래스를 작성합니다.
 * - 직사각형의 넓이와 둘레를 계산하는 메서드를 구현합니다.
 * - 직사각형 객체를 생성하고 넓이와 둘레를 계산하여 출력합니다.
 * - 결과물로 직사각형 객체를 생성하고 넓이와 둘레를 계산하여 출력하는 스크린샷을 제출합니다.
 */
public class Rectangle {
    private final Double width;
    private final Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double calculateArea() {
        return width * height;
    }

    public Double calculatePerimeter() {
        return width *2 + height * 2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1.5, 3.6);
        System.out.println("넓이: " + rectangle.calculateArea());
        System.out.println("둘레: " + rectangle.calculatePerimeter());
    }
}
