package com.cesar31.activaciones.main;

import com.cesar31.activaciones.instruction.*;
import com.cesar31.activaciones.parser.*;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author cesar31
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(args.length);
        String input = readData(args[0]);
        System.out.println(input);

        ActivacionesLex lex = new ActivacionesLex(new StringReader(input));
        ActivacionesParser parser = new ActivacionesParser(lex);
        List<Instruction> ast;
        try {
            ast = (List<Instruction>) parser.parse().value;
            checkAst(ast);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void checkAst(List<Instruction> ast) {
        HashMap<String, Function> functions = new HashMap<>();
        StringBuilder dot = new StringBuilder();
        dot.append("digraph tree{\n").append("\tprogram;\n");

        for (Instruction i : ast) {
            if (i instanceof Function) {
                functions.put(((Function) i).getName(), (Function) i);
                // dot.getDot().append("\t").append(((Function) i).getName()).append(";\n");
            }
        }

        int j = 0;
        for (Instruction i : ast) {
            if (!(i instanceof Function)) {
                if (i instanceof FunctionCall) {
                    dot.append("\t").append(((FunctionCall) i).getFunction()).append(j).append("[ label = ").append(((FunctionCall) i).getFunction()).append(" ]").append(";\n");
                    dot.append("\t").append("program -> ").append(((FunctionCall) i).getFunction()).append(j).append(";\n");
                }

                if (i instanceof Operation) {
                    if (((Operation) i).call != null) {
                        dot.append("\t").append(((Operation) i).call.getFunction()).append(j).append("[ label = ").append(((Operation) i).call.getFunction()).append(" ]").append(";\n");
                        dot.append("\t").append("program -> ").append(((Operation) i).call.getFunction()).append(j).append(";\n");
                    }
                }

                i.run(functions, dot, j);
            }
            j++;
        }

        dot.append("}");
        generateGraph(dot.toString());
    }

    public static void generateGraph(String dot) {
        try {
            MutableGraph g = new guru.nidi.graphviz.parse.Parser().read(dot);
            // Graphviz.fromString(dot).width(600).render(Format.PNG).toFile(new File("tree2.png"));
            Graphviz.fromGraph(g).width(600).render(Format.PNG).toFile(new File("tree.png"));
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static String readData(String path) {
        String string = "";
        File file = new File(path);
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = br.readLine();
                while (line != null) {
                    string += "\n" + line;
                    line = br.readLine();
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return string;
    }
}
