package com.vinu.java17.ocp.chap4;

/**
 * @author Vinu Prabhakaran
 * on Jul 12,2022
 */
public class StringMethods {
    public static void main(String[] args) {
        String value = "animals";
        System.out.println(value+true); //animalstrue
        System.out.println(value.substring(3,3)); // empty
        String txtBlock= """
                My Name is\n
                
                
                """;
        System.out.println(txtBlock);
        System.out.println("***********************");
        System.out.println("Trimmed :"+txtBlock.trim());
        System.out.println("***********************");
        //indent()
        System.out.println("indent()");
        var block = """
                    a
                     b
                    c""";
        var concat = " a\n"
                    +"  b\n"
                    +" c";
        System.out.println(">"+block+"<");
        System.out.println(">"+concat+"<");
        System.out.println("block.length() :"+block.length());
        System.out.println("block.indent(1) :"+block.indent(1));
        System.out.println("block.indent(-1) :"+block.indent(-1));
        System.out.println("concat.length() :"+concat.length());
        System.out.println("concat.indent(-4) :"+concat.indent(-4));
    }

}
