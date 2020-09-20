package com.wchan.defaults;

public interface InterfaceC extends InterfaceB {
    default void methodC() {
        System.out.println("Inside method C");
    }
}
