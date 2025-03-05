package org.goorm;

import java.util.Scanner;

public class Rectangle {
    private final Double width;
    private final Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double calculateExtent() {
        return width * height;
    }

    public static void main(String[] args) {
        System.out.println("가로, 세로를 공백과 함께 입력해주세요.(예시: 1 4)");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] ary = line.split(" ");
        Double widthD = Double.parseDouble(ary[0]);
        Double heightD = Double.parseDouble(ary[1]);
        Rectangle rectangle = new Rectangle(widthD, heightD);
        System.out.println(rectangle.calculateExtent());

    }


}
