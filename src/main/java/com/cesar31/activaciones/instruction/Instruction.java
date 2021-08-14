package com.cesar31.activaciones.instruction;

import java.util.HashMap;

/**
 *
 * @author cesar31
 */
public interface Instruction {

    public Object run(HashMap<String, Function> f,StringBuilder dot, Integer i);
}
