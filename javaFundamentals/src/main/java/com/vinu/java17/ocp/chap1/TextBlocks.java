package com.vinu.java17.ocp.chap1;

/**
 * @author Vinu Prabhakaran
 * on Jun 24,2022
 */
public class TextBlocks {
    private int numForks;
    public static void main(String[] args) {
        String block1 = """
                    Hello Vinu,
                How do you do?
                    Text blocks are a nice feature            
                    """;
        System.out.println("***********block1****************");
        System.out.println(block1);
        System.out.println("***********block2****************");
        String block2 = """
                    Hello Vinu,
                How do you do? Backslash ignores new line at end of this line \
                    Text blocks are a nice feature            
                    """;
        System.out.println(block2);
        System.out.println("************block3***************");
        String block3 = """
                doe \n
                "deer            
                    """;
        System.out.println(block3);
        System.out.println("***********block4****************");
        int numKnives;
        System.out.print("""
        "# forks = " + numForks +
        " # knives = " + numKnives +
        # cups = 0""");
    }
}
