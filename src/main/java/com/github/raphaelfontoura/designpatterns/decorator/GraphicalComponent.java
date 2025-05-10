package com.github.raphaelfontoura.designpatterns.decorator;

public interface GraphicalComponent {
    public void paint();
    public GraphicalComponent addContent(Object content);
}
