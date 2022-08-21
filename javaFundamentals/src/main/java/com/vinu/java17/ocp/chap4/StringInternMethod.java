package com.vinu.java17.ocp.chap4;

/**
 * @author Vinu Prabhakaran
 * on Jul 17,2022
 */
public class StringInternMethod {
    public static void main(String[] args) {
        String name = "Hello World";
        String newName = new String("Hello World").intern();
        System.out.println(name == newName);

        var first = "rat" + 1;
        var second = "r"+"a"+"t"+1;
        var third = "r"+"a"+"t"+new String("1");
        System.out.println(first == second);
        System.out.println(first == second.intern());
        System.out.println(first == third);
        System.out.println(first == third.intern());

    }
}
