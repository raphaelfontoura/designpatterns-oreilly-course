package com.github.raphaelfontoura.designpatterns.templatemethod;

import java.util.List;

public class Result {

    private List<String> result;

    public Result() {
    }

    public Result(List<String> result) {
        this.result = result;
    }

    public void printOutput() {
        System.out.println(result);
    }

}
