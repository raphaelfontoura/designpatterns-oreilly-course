package com.github.raphaelfontoura.designpatterns.command;

import java.util.stream.IntStream;

public class Demo {

    public static void main(String[] args) {
        System.out.println("The sum of numbers from 1 to 100: " + sum(1, 100, new Function() {
            @Override
            public int apply(int i) {
                return i;
            }
        }));
        System.out.println("Them sum of squares from 1 to 10: " + sum(1, 10, new Function() {
            @Override
            public int apply(int i) {
                return i * i;
            }
        }));
        System.out.println("The sum of numbers from 1 to 100: " + sumJava8(1, 100, i -> i));
        System.out.println("Them sum of squares from 1 to 10: " + sumJava8(1, 10, i -> i * i));
    }

    private static int sum(int lower, int upper, Function f) {
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            sum += f.apply(i);
        }
        return sum;
    }

    private static int sumJava8(int lower, int upper, Function f) {
        return IntStream.rangeClosed(lower, upper)
                .map(f::apply)
                .sum();
    }

    // private static int sumOfSquare(int lower, int upper) {
    //     int sum = 0;
    //     for (int i = lower; i <= upper; i++) {
    //         sum += i * i;
    //     }
    //     return sum;
    // }

    // private static int sumOfSequence(int lower, int upper) {
    //     int sum = 0;
    //     for (int i = lower; i <= upper; i++) {
    //         sum += i;
    //     }
    //     return sum;
    // }

}
