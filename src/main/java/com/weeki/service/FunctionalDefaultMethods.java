package com.weeki.service;

/**
 * @author WeekiXu
 * Demo for function interface static method
 */
public interface FunctionalDefaultMethods {
    void method();

    /**
     * default method demo
     */
    default void defaultMethod() {
        System.out.printf("This is a default method");
    }
}
