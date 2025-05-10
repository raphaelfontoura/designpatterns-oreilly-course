package com.github.raphaelfontoura.designpatterns.decorator;

public class BorderDecorator extends Decorator {

    public BorderDecorator(GraphicalComponent next) {
        super(next);
    }

    @Override
    public void paint() {
        System.out.println("======== BorderDecorator ========");
        super.paint();
        System.out.println("======== BorderDecorator ========");
    }

}
