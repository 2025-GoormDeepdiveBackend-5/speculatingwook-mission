package org.goorm;

import java.util.Scanner;

public class Rectangle {
    private static Double calculateExtent(Double width, Double height) {
        return width * height;
    }

    public static void main(String[] args) {
        System.out.println("가로, 세로를 공백과 함께 입력해주세요.(예시: 1 4)");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] ary = line.split(" ");
        Double widthD = Double.parseDouble(ary[0]);
        Double heightD = Double.parseDouble(ary[1]);
        System.out.println(calculateExtent(widthD, heightD));

    }


}
