package com.codingman.tools.debug;

import org.apache.commons.lang3.math.NumberUtils;

public class TestMain {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        NumberUtils.compare(a, b);
        test1();
        System.out.println(c);
    }

    public static boolean test1() {
        return test2();
    }

    public static boolean test2() {
        return false;
    }
}
