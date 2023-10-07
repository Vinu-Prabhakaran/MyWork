package com.vinu.ocpchap3;

import java.util.List;

/**
 * @author Vinu Prabhakaran
 * on Oct 07,2023
 * A Generic class can have parameterized types where a type parameter can be substituted with
 * a parameterized type. Following example will showcase above mentioned concept.
 */
public class GenericsParameterizedType {
    public static void main(String[] args) {
        DoubleBox<Integer, List<String>> parameterizedBox=new DoubleBox<>();
        parameterizedBox.addItem(123,List.of("Item#1","Item#2","Item#3"));
        System.out.println("Integer item :"+parameterizedBox.getFirstItem());
        System.out.println("List item :"+parameterizedBox.getSecondItem());
    }
}