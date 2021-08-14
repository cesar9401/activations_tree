package com.cesar31.activaciones.instruction;

import java.util.HashMap;

/**
 *
 * @author cesar31
 */
public class FunctionCall implements Instruction {

    private String function;

    public FunctionCall(String function) {
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    @Override
    public Object run(HashMap<String, Function> f, StringBuilder dot, Integer i) {

        Function fun = f.get(function);
        if (fun != null) {
            return fun.run(f, dot, i);
        }

        System.out.println("no llamada function -> " + function);
        return null;
    }
}
