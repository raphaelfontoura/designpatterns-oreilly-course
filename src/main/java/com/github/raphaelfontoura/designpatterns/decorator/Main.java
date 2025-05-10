package com.github.raphaelfontoura.designpatterns.decorator;

public class Main {

    public static void main(String[] args) {
        GraphicalComponent tf = constructHCAndersenPoem();
        tf = new BorderDecorator(tf);
        tf.paint();
    }

    public static GraphicalComponent constructHCAndersenPoem() {
        GraphicalComponent poem = new TextField();
        poem = poem.addContent("To move, to breathe, to fly, to float,");
        poem = poem.addContent("To gain all while you give,");
        poem = poem.addContent("To roam the roads of lands remote,");
        poem = poem.addContent("To travel is to live.");
        poem = poem.addContent("There are no foreign lands.");
        poem = poem.addContent("It is the traveler only who is foreign.");
        poem = poem.addContent("-- H.C. Andersen");
        return poem;
    }

}
