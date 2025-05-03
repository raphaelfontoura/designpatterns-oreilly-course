package com.github.raphaelfontoura.designpatterns.proxy;

abstract public class BusinessObject {

    public abstract void sayHi();
    public static BusinessObject create() {
        return new BusinessObjectProxy(new BusinessObjectImplementation());
    }

}