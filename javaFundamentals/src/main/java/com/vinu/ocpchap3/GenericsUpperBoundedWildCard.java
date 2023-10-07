package com.vinu.ocpchap3;

import java.util.List;

/**
 * @author Vinu Prabhakaran
 * on Oct 07,2023
 */
public class GenericsUpperBoundedWildCard {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3,4,5);
        List<Double> doubleList = List.of(1.1,2.2,3.3,4.4,5.5);
        System.out.println("Integer List sum :"+sum(integerList));
        System.out.println("Double List sum :"+sum(doubleList));
    }

    /**
     * The question mark (?), represents the wildcard, stands for unknown type in generics.
     * There may be times when you'll want to restrict the kinds of types that are allowed to
     * be passed to a type parameter. For example, a method that operates on numbers might only
     * want to accept instances of Number or its subclasses.
     *
     * <p>To declare a upper bounded Wildcard parameter, list the ?, followed by the extends keyword,
     * followed by its upper bound.
     * @param list
     * @return double
     */
    public static double sum(List<? extends Number> list){
        double sum=0;
        for (Number number:list){
            sum+=number.doubleValue();
        }
        return sum;
    }
}
