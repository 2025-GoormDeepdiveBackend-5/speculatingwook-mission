package org.goorm.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * - 사용자로부터 정수 배열을 입력받습니다.
 * - 버블 정렬, 선택 정렬 등의 간단한 정렬 알고리즘을 구현하여 배열을 정렬합니다.
 * - 정렬 전후의 배열 상태를 출력합니다.
 * - 결과물로 정렬 전후의 배열 상태를 보여주는 스크린샷을 제출합니다.
 */
public class SortMain {
    final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        SortMain main = new SortMain();
        System.out.println("정수 배열을 공백을 기준으로 입력해주세요.(예: 1 4 5 13 23)");
        int[] arr = Arrays.stream(main.scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] arr2 = arr.clone();
        Sort bubbleSort = new BubbleSort();
        Sort selectionSort = new SelectionSort();

        System.out.println("정렬 전");
        System.out.println(Arrays.toString(arr));
        System.out.println("버블 정렬 후");
        System.out.println(Arrays.toString(bubbleSort.sort(arr)));

        System.out.println("선택 정렬 후");
        System.out.println(Arrays.toString(selectionSort.sort(arr2)));

    }
}
