package com.github.raphaelfontoura.designpatterns.proxy;

public class Main {

    public static void main(String[] args) {
        BusinessObject businessObject = BusinessObject.create();
        businessObject.sayHi();
    }
}
