package com.vinu.ocpchap3;

/**
 * @author Vinu Prabhakaran
 * on Oct 07,2023
 */
public class GenericsTest {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        integerBox.add(Integer.valueOf("123"));
        stringBox.add("abc");

        System.out.println("IntegerBox contains :"+integerBox.get());
        System.out.println("StringBox contains :"+stringBox.get());
    }
}

class Box<T>{
    private T t;

    public void add (T t){
        this.t=t;
    }

    public T get(){
        return t;
    }
}