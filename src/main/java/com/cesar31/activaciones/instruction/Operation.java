package com.cesar31.activaciones.instruction;

import java.util.HashMap;

/**
 *
 * @author cesar31
 */
public class Operation implements Instruction {

    public FunctionCall call;

    public Operation(FunctionCall call) {
        this.call = call;
    }

    @Override
    public Object run(HashMap<String, Function> f, StringBuilder dot, Integer i) {
        if (call != null) {
            return call.run(f, dot, i);
        }

        return null;
    }
}
