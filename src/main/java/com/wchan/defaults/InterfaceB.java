package com.wchan.defaults;

public interface InterfaceB extends InterfaceA {
    @Override
    default void methodA() {
        System.out.println("Inside Method A" + InterfaceB.class);
    }
    default void methodB() {
        System.out.println("Inside Method B");
    }
}
