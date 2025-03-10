package org.goorm.string;

import java.util.Scanner;

/**
 * - 사용자로부터 문자열을 입력받습니다.
 * - 입력받은 문자열을 뒤집어 출력합니다.
 * - 입력받은 문자열의 대소문자를 변환하여 출력합니다.
 * - 결과물로 사용자가 입력한 문자열을 뒤집고 대소문자를 변환하여 출력하는 스크린샷을 제출합니다.
 */
public class StringUtils {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("문자열을 입력해주세요:");
            String line = scanner.nextLine();

            // 문자열 뒤집기
            String reversed = new StringBuilder(line).reverse().toString();

            // 대소문자 변환
            String caseFlipped = flipCase(reversed);

            System.out.println("뒤집힌 문자열: " + reversed);
            System.out.println("대소문자 변환된 문자열: " + caseFlipped);
        }
    }

    private static String flipCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            sb.append(Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
        }
        return sb.toString();
    }
}
