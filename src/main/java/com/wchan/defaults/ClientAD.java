package com.wchan.defaults;

public class ClientAD implements InterfaceA, InterfaceD {
    // InterfaceA and InterfaceB have conflicting default methodA
    // We must override in the implementing class to resolve conflict.
    @Override
    public void methodA() {
        System.out.println("Method A" + ClientAD.class);
    }
}
