/**
 * 
 */
package com.vinu.codechallenge.amz;

/**
 * @author Vinu Prabhakaran
 *         on Sep 2, 2021
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
     * Complete the 'foo' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY codeList
     *  2. STRING_ARRAY shoppingCart
     */

    public static int foo(List<String> codeList, List<String> shoppingCart) {
    // Write your code here
    System.out.println("codeList:"+codeList+"/shoppingCart:"+shoppingCart);
    
    if (shoppingCart.size() == 0 || codeList.size() == 0){
        return 0;
    }
        List<String> newCodeList=new ArrayList<>();

    codeList.forEach(w ->{
        Stream.of(w.split(" ")).forEach(s -> newCodeList.add(s));
    });
    System.out.println("newCodeList:"+newCodeList+"/shoppingCart:"+shoppingCart);
        boolean firstHit=false;
        if (shoppingCart.size() < newCodeList.size()){
            return 0;
        }
        int j=0;
        while(j < shoppingCart.size()){
            if ((shoppingCart.get(j).equals(newCodeList.get(0)))
                || (newCodeList.get(0).equals("anything") && shoppingCart.get(j)!=null)){
                firstHit = true; // j has index of first match in shoppingCart
                System.out.println("First match at "+j);
                break;
            }
            j++;
        }
        if (!firstHit){
            return 0;
        }
        if ((shoppingCart.size() - (j+1)) < newCodeList.size()-1 ){
            return 0;
        }
        int i=0,k=0;
        for ( i=1, k=j+1;i<newCodeList.size() && k<shoppingCart.size();i++,k++){
            if(newCodeList.get(i) != null && shoppingCart.get(k) != null){
                if(newCodeList.get(i).equals(shoppingCart.get(k))){
                    continue;
                }else if(newCodeList.get(i).equals("anything")){
                    continue;
                }else{
                    if (i>1){
                        i--;
                    }else
                    return 0;
                }
            }else{
                return 0;
            }
        }
        if (i<newCodeList.size()){
            return 0;
        }
        return 1;
    }

}

public class AmazonCodeDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int codeListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> codeList = IntStream.range(0, codeListCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int shoppingCartCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> shoppingCart = IntStream.range(0, shoppingCartCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result1.foo(codeList, shoppingCart);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


/*Compiler Message
Runtime Error
Error (stderr)
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
	at java.util.ArrayList.rangeCheck(ArrayList.java:657)
	at java.util.ArrayList.get(ArrayList.java:433)
	at Result.foo(Solution.java:40)
	at Solution.main(Solution.java:105)
Your Output (stdout)
~ no response on stdout ~
Debug output
codeList:[]/shoppingCart:[kiwi, apricot]
newCodeList:[]/shoppingCart:[kiwi, apricot]*/