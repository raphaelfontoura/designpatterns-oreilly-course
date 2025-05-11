package com.github.raphaelfontoura.designpatterns.factory.shapes;

public interface Shape {
    void draw();
    public static Shape create(String s) {
        if (s.startsWith("#rect")) {
            return new Rectangle();
        } else if (s.startsWith("#oval")) {
            return new Oval();
        } else if (s.startsWith("#line")) {
            return new Line();
        } else {
            throw new IllegalArgumentException("Unknown shape type: " + s);
        }
    }
} 
