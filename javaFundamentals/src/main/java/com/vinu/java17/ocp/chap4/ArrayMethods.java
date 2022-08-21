package com.vinu.java17.ocp.chap4;

import java.util.Arrays;

/**
 * @author Vinu Prabhakaran
 * on Jul 19,2022
 */
public class ArrayMethods {
    public static void main(String[] args) {

        String[] bugs= { "cricket", "beetle", "ladybug" };
        String[] alias = bugs;
        System.out.println(bugs == alias);
        System.out.println(bugs.equals(alias));  // uses reference equality
        System.out.println(Arrays.toString(alias));

        System.out.println(bugs.length);
        // compare()
        System.out.println("compare()");
        System.out.println(Arrays.compare(new int[]{1,2},new int[]{1,2,3}));
        System.out.println(Arrays.compare(new int[]{1,2,3,4,5},new int[]{1,2}));
        //mismatch()
        System.out.println("mismatch()");
        System.out.println(Arrays.mismatch(new int[]{1,2},new int[]{1,2,3}));
        System.out.println(Arrays.mismatch(new int[]{1,2,3},new int[]{1,2}));


    }
}
