package org.goorm;

public class AddSub {
    private static Integer add(int a, int b) {
        return a + b;
    }

    private static Integer subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(add(a, b));
        System.out.println(subtract(a, b));
    }
}
