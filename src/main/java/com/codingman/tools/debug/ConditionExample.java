package com.codingman.tools.debug;

/**
 * 条件断点
 *
 * @author ty
 */
public class ConditionExample {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            // 还可以开启remove once hit
            System.out.println(i);
        }
        passCount();
    }

    /**
     * 循环次数判断
     */
    private static void passCount() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
