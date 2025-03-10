package org.goorm.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * - 사용자로부터 두 개의 숫자와 연산자를 입력받습니다.
 * - 람다 표현식을 사용하여 입력받은 숫자와 연산자에 따른 계산 기능을 구현합니다.
 * - 계산 결과를 출력합니다.
 * - 결과물로 사용자 입력을 받아 람다 표현식으로 구현된 계산 기능을 수행하는 스크린샷을 제출합니다.
 */
public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("두개의 숫자와 연산자를 ,을 기준으로 입력해주세요.(예: 1,4,+)");
            String line = scanner.nextLine();
            String[] inputs = line.split(",");

            if (inputs.length != 3) {
                System.out.println("입력 형식이 잘못되었습니다. 예: 1,4,+");
                return;
            }

            int num1, num2;
            try {
                num1 = Integer.parseInt(inputs[0]);
                num2 = Integer.parseInt(inputs[1]);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 올바르게 입력해주세요.");
                return;
            }

            String operator = inputs[2];

            // 연산자와 람다 표현식을 매핑
            Map<String, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();
            operations.put("+", (a, b) -> a + b);
            operations.put("-", (a, b) -> a - b);
            operations.put("*", (a, b) -> a * b);
            operations.put("/", (a, b) -> b != 0 ? a / b : null);

            BiFunction<Integer, Integer, Integer> operation = operations.get(operator);

            if (operation == null) {
                System.out.println("지원하지 않는 연산자입니다. (+, -, *, / 중 하나를 사용해주세요)");
                return;
            }

            Integer result = operation.apply(num1, num2);

            if (result == null) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                System.out.println("결과: " + result);
            }
        }
    }
}
