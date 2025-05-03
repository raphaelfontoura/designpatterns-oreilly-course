package com.github.raphaelfontoura.designpatterns.proxy;

public class BusinessObjectProxy extends BusinessObject {

    private BusinessObject target;

    public BusinessObjectProxy(BusinessObject target) {
        this.target = target;
    }

    @Override
    public void sayHi() {
        System.out.println("BusinessObjectProxy: Before calling sayHi");
        target.sayHi();
        System.out.println("BusinessObjectProxy: After calling sayHi");
    }

}
