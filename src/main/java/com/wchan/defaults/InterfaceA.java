package com.wchan.defaults;

public interface InterfaceA {
    default void methodA() {
        System.out.println("Inside method A" + InterfaceA.class);
    }
}
