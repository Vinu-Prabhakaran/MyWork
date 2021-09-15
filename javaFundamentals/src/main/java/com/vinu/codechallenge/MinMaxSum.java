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

class MinMaxSumResult {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        arr.stream().sorted((n1,n2) -> n1-n2).limit(4).mapToLong(Long::new).reduce((n1,n2)-> n1+n2).ifPresent(System.out::print);
        System.out.print(" ");
        arr.stream().sorted((n1,n2) -> n2-n1).limit(4).mapToLong(Long::new).reduce((n1,n2)-> n1+n2).ifPresent(System.out::print);
    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        MinMaxSumResult.miniMaxSum(arr);

        bufferedReader.close();
    }
}
