package com.vinu.ocpchap3;

/**
 * @author Vinu Prabhakaran
 * on Oct 07,2023
 */
public class GenericMultitypeTest {
    public static void main(String[] args) {
        DoubleBox<Integer,String> multiTypeBox = new DoubleBox<>();
        multiTypeBox.addItem(1,"Item#1");
        System.out.println("First Item :"+multiTypeBox.getFirstItem());
        System.out.println("Second Item :"+multiTypeBox.getSecondItem());
    }
}

class DoubleBox<T,V>{
    private T firstItem;
    private V secondItem;

    public void addItem(T firstItem, V secondItem){
        this.firstItem= firstItem;
        this.secondItem = secondItem;
    }

    public T getFirstItem(){
        return this.firstItem;
    }
    public V getSecondItem(){
        return this.secondItem;
    }
}
