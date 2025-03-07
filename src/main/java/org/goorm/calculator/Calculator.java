package org.goorm.calculator;

import java.util.Scanner;

/**
 * 사용자로부터 두 개의 숫자와 연산자를 입력받는 계산기 프로그램을 작성합니다.
 * 사용자 입력 값이 잘못되었을 때 예외 처리를 구현하여 적절한 오류 메시지를 출력합니다.
 * 예외 처리가 동작하는 것을 확인할 수 있도록 프로그램을 실행하고 결과를 확인합니다.
 * 결과물로 사용자 입력 값이 잘못되었을 때 예외 처리가 동작하는 스크린샷을 제출합니다.
 */
public class Calculator {
    final Scanner scanner = new Scanner(System.in);

    public Double calculate(Double a, Double b, String operator) {
        if (operator.equals("+")) {
            return a + b;
        }
        if (operator.equals("-")) {
            return a - b;
        }
        if (operator.equals("*")) {
            return a * b;
        }
        if (operator.equals("/")) {
            if (b == 0.0) {
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            return a / b;
        }
        throw new IllegalArgumentException("연산자 입력이 잘못되었습니다.");
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("숫자, 숫자, 연산자를 입력해주세요. 연산자는 +, -, *, / 입니다.(예시: 3 3 +)");
        String line = calculator.scanner.nextLine();
        String[] arr = line.split(" ");
        try {
            Double a = Double.parseDouble(arr[0]);
            Double b = Double.parseDouble(arr[1]);
            String operator = arr[2];
            System.out.println(calculator.calculate(a, b, operator));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
