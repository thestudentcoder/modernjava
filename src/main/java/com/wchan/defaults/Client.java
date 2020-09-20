package com.wchan.defaults;

public class Client implements InterfaceA, InterfaceB, InterfaceC {

    @Override
    public void methodA() {
        System.out.println("Method A" + Client.class);
    }

    public static void main(String[] args) {
        Client client = new Client();
        // Interface B overrides default method A in Interface A
        // The overridden method in Interface B will be called
        // and then the Client.
        client.methodA();  // resolve to the child implementation
        client.methodB();
        client.methodC();
    }
}
