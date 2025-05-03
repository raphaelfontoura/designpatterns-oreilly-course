package com.github.raphaelfontoura.designpatterns.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest{

    @Test
    public void testConstant() {
        double testValue = 3.0;
        Expression e = new Constant(testValue);

        assertEquals(testValue, e.getValue(), 0.0);
    }

    @Test
    void testAdder() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Adder(left, right);
        double expectedValue = testValueA + testValueB;
        assertEquals(expectedValue, e.getValue(), 0.0);
    }
    
    @Test
    void testSubtractor() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Subtractor(left, right);
        double expectedValue = testValueA - testValueB;
        assertEquals(expectedValue, e.getValue(), 0.0);
    }

    @Test
    void testMultiplier() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Multiplier(left, right);
        double expectedValue = testValueA * testValueB;
        assertEquals(expectedValue, e.getValue(), 0.0);
    }

    @Test
    void testDivider() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Divider(left, right);
        double expectedValue = testValueA / testValueB;
        assertEquals(expectedValue, e.getValue(), 0.0);
    }

    @Test
    void testComplexExpression() {
        Expression e = 
            new Divider(
                new Multiplier(
                    new Adder(new Constant(3.0), new Constant(5.0)),
                    new Constant(100.0)
                    ),
                new Adder(new Constant(2.0), new Constant(64.0))
            );
        double expectedValue = (3.0 + 5.0) * 100.0 / (2.0 + 64.0);
        assertEquals(expectedValue, e.getValue(), 0.0);
    }
}
