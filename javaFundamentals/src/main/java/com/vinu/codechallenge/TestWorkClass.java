/**
 * 
 */
package com.vinu.codechallenge;

import java.util.Scanner;

/**
 * @author Vinu Prabhakaran
 *         on Aug 8, 2021
 *
 */
public class TestWorkClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        double d =Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

