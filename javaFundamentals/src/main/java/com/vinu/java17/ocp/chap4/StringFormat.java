package com.vinu.java17.ocp.chap4;

/**
 * @author Vinu Prabhakaran
 * on Jul 15,2022
 */
public class StringFormat {
    public static void main(String[] args) {
        /*
        %s Applies to any type, commonly String values
        %d Applies to integer values like int and long
        %f Applies to floating-point values like float and double
        %n Inserts a line break using the system-dependent line separator
        */

        var name = "Kate";
        var orderId = 5;
        System.out.println(String.format("Hello %s , your order# %d is ready",name,5));
        System.out.println(("%s , your order# %d is ready").formatted("Vinu",1011));

        var sname = "James";
        var score = 90.25;
        var total = 100;
        System.out.println(("%s,%n  Score is %.2f out of %d ").formatted(sname,score,total));

        var pi = Math.PI;
        System.out.format("[%f]%n",pi); // [3.141593]
        System.out.format("[%12.8f]%n",pi); // [ 3.14159265]
        System.out.format("[%012f]%n",pi); // [00003.141593]
        System.out.format("[%12.2f]%n",pi); // [ 3.14]
        System.out.format("[%.3f]%n",pi); // [3.142]
    }
}
