package com.codingman.tools.debug;

/**
 * 强制退回
 *
 * @author ty
 */
public class ForceReturnExample {
    public static void main(String[] args) {
        String result = a();
        System.out.println(result);
    }

    private static String a() {
        System.out.println("end");
        return "end";
    }
}
