package com.tcs.myApp.model;
import com.tcs.myApp.model.MyCustomException;

public class ExLearnClass {
    private int denominator;
    private int numList[]=new int[4];
    private String name;
    
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public int[] getNumList() {
        return numList;
    }
    public void setNumList(int[] numList) {
        this.numList = numList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void setInitialValues(int den, int numList[], String name)
    {
        this.denominator=den;
        this.numList = numList;
        this.name = name;
    }
    public void showName() throws MyCustomException
    {
        if (name.length() < 10)
        {
            throw new MyCustomException();
        }
        else
        {
        System.out.println(name);
        }
    }     
}

