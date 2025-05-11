package com.github.raphaelfontoura.designpatterns.factory.shapes;

public class Rectangle implements Shape {
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

}
