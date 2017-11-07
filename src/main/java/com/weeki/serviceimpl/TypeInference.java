package com.weeki.serviceimpl;

public class TypeInference {
    public static void main(String[] args) {
        final Value<String> value = new Value();
        value.getOrDefault("33", Value.defaultValue());
        System.out.println(value.getOrDefault("33",Value.defaultValue())+10);
    }
}
