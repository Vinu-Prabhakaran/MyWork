package com.vinu.java17.ocp.chap3;

/**
 * @author Vinu Prabhakaran
 * on Jul 07,2022
 */
public class FlowScoping {
    void printIntegersOrNumbersGreaterThan5(Number number) {
        if(number instanceof Integer data && data.compareTo(5)>0) //Will not compile if || && data.compareTo(5)>0
            System.out.print(data);
    }

}
