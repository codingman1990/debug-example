package com.codingman.tools.debug;

/**
 * 异常断点
 *
 * @author ty
 */
public class ExceptionExample {
    public static void main(String[] args) {
        nullPoint();
        exception();
    }

    private static void exception() {
        throw new TyException();
    }

    private static void nullPoint() {
        String a = null;
        System.out.println(a.toString());
    }

    static class TyException extends RuntimeException {

    }
}
