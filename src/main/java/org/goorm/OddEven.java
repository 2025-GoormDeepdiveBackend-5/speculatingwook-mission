package org.goorm;

import java.util.Scanner;

public class OddEven {
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("숫자를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isEven(number)) {
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }

    }
}
