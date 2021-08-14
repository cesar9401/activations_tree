package com.cesar31.activaciones.instruction;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author cesar31
 */
public class Function implements Instruction {

    private String name;
    private List<Instruction> instructions;

    public Function() {
    }

    public Function(String name, List<Instruction> instructions) {
        this.name = name;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    @Override
    public Object run(HashMap<String, Function> f, StringBuilder dot, Integer i) {
        int j = 0;
        for (Instruction ins : instructions) {
            if (ins instanceof FunctionCall) {
                dot.append("\t").append(((FunctionCall) ins).getFunction()).append(i).append(j).append("[ label = ").append(((FunctionCall) ins).getFunction()).append(" ]").append(";\n");
                dot.append("\t").append(name).append(i).append(" -> ").append(((FunctionCall) ins).getFunction()).append(i).append(j).append(";\n");
            }

            if (ins instanceof Operation) {
                if (((Operation) ins).call != null) {
                    dot.append("\t").append(((Operation) ins).call.getFunction()).append(i).append(j).append("[ label = ").append(((Operation) ins).call.getFunction()).append(" ]").append(";\n");
                    dot.append("\t").append(name).append(i).append(" -> ").append(((Operation) ins).call.getFunction()).append(i).append(j).append(";\n");

                }
            }
            ins.run(f, dot, i * 10 + j);
            j++;
        }

        return null;
    }
}
