package com.wchan.defaults;

public interface InterfaceD {
    default void methodA() {
        System.out.println("Method A" + InterfaceD.class);
    }
}
