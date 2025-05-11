package com.github.raphaelfontoura.designpatterns.factory.shapes;

public class Oval implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing an oval");
    }

}
