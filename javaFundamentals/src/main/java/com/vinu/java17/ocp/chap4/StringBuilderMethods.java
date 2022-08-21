package com.vinu.java17.ocp.chap4;

/**
 * @author Vinu Prabhakaran
 * on Jul 15,2022
 */
public class StringBuilderMethods {
    public static void main(String[] args) {
        // append()
        var sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true
        //insert()
        var sb1 = new StringBuilder("animals");
        sb1.insert(7, "-");// sb = animals-5:
        sb1.insert(0, "-");// sb = -animals-
        sb1.insert(4, "-");// sb = -ani-mals-
        System.out.println(sb1);
        //delete()
        var sb2 = new StringBuilder("abcdef");
        sb2.delete(1, 3); // sb = adef
        //sb2.deleteCharAt(5); // exception
        //replace()
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder); // pigsty dirty
        builder.replace(1,4,"1234567");
        System.out.println(builder);
    }
}
