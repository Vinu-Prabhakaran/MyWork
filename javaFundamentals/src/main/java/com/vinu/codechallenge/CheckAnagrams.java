/**
 * 
 */
package com.vinu.codechallenge;

import java.util.Arrays;
/**
 * @author Vinu Prabhakaran
 *         on Aug 14, 2021
 *
 */
import java.util.Scanner;

public class CheckAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] arrA=a.toLowerCase().toCharArray();
        char[] arrB=b.toLowerCase().toCharArray();
        java.util.Arrays.sort(arrA);
        java.util.Arrays.sort(arrB);
        System.out.println("A"+Arrays.toString(arrA));
        System.out.println("B"+Arrays.toString(arrB));

        if (Arrays.equals(arrA,arrB)) return true;
        return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
