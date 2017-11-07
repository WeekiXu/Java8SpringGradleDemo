package com.weeki.service;

/**
 * @author WeekiXu
 * Demo for Java8 default method
 */
public interface Defaulable {
    default String notRequired() {
        return "Default implementation";
    }

    int getCount();

    void setCount(int count);
}
