/**
 * 
 */
package com.vinu.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 7, 2021
 *
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        float size=arr.size();
        Long zeroes=arr.stream().filter(n -> n==0).count();
        Long positives=arr.stream().filter(n -> n>0).count();
        Long negatives=arr.stream().filter(n -> n<0).count();
        System.out.println(String.format("%.06f",positives/size));
        System.out.println(String.format("%.06f",negatives/size));
        System.out.println(String.format("%.06f",zeroes/size));
    }

}

public class PostivitiveNegativeZeroRatio {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result1.plusMinus(arr);

        bufferedReader.close();
    }
}
