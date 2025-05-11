package com.github.raphaelfontoura.designpatterns.factory.shapes;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Shape> shapes;
    public Client() {
        shapes = new ArrayList<>();
    }
    
    public void readShapes(String [] shapes) {
        for (String shape : shapes) {
            this.shapes.add(Shape.create(shape));
        }
    }

    public void drawAllShapes() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
