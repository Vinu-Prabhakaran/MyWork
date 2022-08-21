package com.vinu.java17.ocp.chap4;

/**
 * @author Vinu Prabhakaran
 * on Jul 10,2022
 */
public class StringConcatWithAddOperator {

    public static void main(String[] args) {
        System.out.println(null+"c"+null);
        var s = "1";
        s+="2";
        s+="3";
        System.out.println("Final s = "+s);
    }
}
