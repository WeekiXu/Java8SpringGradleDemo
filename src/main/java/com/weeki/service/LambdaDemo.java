package com.weeki.service;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "3", "z", "f");
        list.sort((e1, e2) -> e1.compareTo(e2));
        list.forEach(item -> System.out.println(item));
    }
}
