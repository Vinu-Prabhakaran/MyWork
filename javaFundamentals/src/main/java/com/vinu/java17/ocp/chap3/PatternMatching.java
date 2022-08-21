package com.vinu.java17.ocp.chap3;

/**
 * @author Vinu Prabhakaran
 * on Jul 06,2022
 */
public class PatternMatching {

    static void compareIntegers(Number number){
        if (number instanceof Integer){
            System.out.println(((Integer) number).compareTo(5));
        }
    }
    static void compareIntegersUsingPatternMatchig(Number number){
        if (number instanceof Integer intNum){
            System.out.println(intNum.compareTo(5));
        }
    }
    public static void main(String[] args) {
        compareIntegers(4);
        compareIntegers(6);
    }
}
