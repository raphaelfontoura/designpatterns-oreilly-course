package com.github.raphaelfontoura.designpatterns.factory.shapes;

public class Line implements Shape {
    
    @Override
    public void draw() {
        System.out.println("Drawing a line");
    }

}
