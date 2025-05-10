package com.github.raphaelfontoura.designpatterns.decorator;

public abstract class Decorator implements GraphicalComponent {
    private GraphicalComponent next;

    public Decorator(GraphicalComponent next) {
        this.next = next;
    }
    @Override
    public void paint() {
        if (next != null) {
            next.paint();
        }
    }
    @Override
    public GraphicalComponent addContent(Object content) {
        if (next != null) {
            return next.addContent(content);
        }
        return this;
    }

}
