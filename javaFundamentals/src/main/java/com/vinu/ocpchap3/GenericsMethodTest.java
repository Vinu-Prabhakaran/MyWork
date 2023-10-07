package com.vinu.ocpchap3;

/**
 * @author Vinu Prabhakaran
 * on Oct 07,2023
 */
public class GenericsMethodTest {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        Double[] doubles = {1.1,2.2,3.3,4.4};
        String[] strings= {"a","b","c","d"};

        System.out.println("Integer Array");
        printArray(integers);
        System.out.println("Doubles Array");
        printArray(doubles);
        System.out.println("String Array");
        printArray(strings);

    }
    public static <E> void printArray(E[] t){
        for (E item : t){
            System.out.println(item);
        }
    }

}
