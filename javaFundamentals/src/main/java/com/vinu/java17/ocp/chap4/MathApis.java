package com.vinu.java17.ocp.chap4;

import static java.lang.Math.*;
/**
 * @author Vinu Prabhakaran
 * on Jul 23,2022
 */
public class MathApis {
    public static void main(String[] args) {

        System.out.format("round(3.14)) = %d", round(3.14)); //returns long or int
        System.out.println();

        System.out.println("ceil(3.14) = "+ceil(3.14));
        System.out.println("floor(3.99) = "+floor(3.99));

        System.out.println("random() = "+random()); // returns n , 0<= n < 1
    }
}
