package com.vinu.java17.ocp.chap3;

/**
 * @author Vinu Prabhakaran
 * on Jul 07,2022
 */
public class CombinedCaseInSwitch {

    public static void main(String[] args) {
        checkType(1);
    }

    private static void checkType(int i) {
        switch (i){
            case 1,2:
                System.out.println("Lion");
                break;
            case 3:
                System.out.println("Tiger");
        }
    }
}
