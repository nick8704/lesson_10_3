package com.company;

public class TestClass {

    private static int a = 10;
    private static int b = a;
    private static int c = getC();

    private static int result = 123;

    static {
        result = a + b + c;
    }

    private static int getC() {
        return a + b;
    }

    public static int getResult() {
        return result;
    }
}