package com.github.raphaelfontoura.designpatterns.decorator;

public class ScrollBarDecorator extends Decorator {

    public ScrollBarDecorator(GraphicalComponent next) {
        super(next);
    }

    @Override
    public void paint() {
        System.out.println("<<<<-- Render the scroll bar -->>>>");
        super.paint();
    }

}
