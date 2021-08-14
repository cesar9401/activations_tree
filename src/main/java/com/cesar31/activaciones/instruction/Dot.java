package com.cesar31.activaciones.instruction;

/**
 *
 * @author cesar31
 */
public class Dot {

    private StringBuilder dot;
    private Integer function;

    public Dot() {
        this.dot = new StringBuilder();
        this.function = 0;
    }

    public StringBuilder getDot() {
        return dot;
    }

    public void setDot(StringBuilder dot) {
        this.dot = dot;
    }

    public Integer getFunction() {
        return function;
    }

    public void setFunction(Integer function) {
        this.function = function;
    }
}
