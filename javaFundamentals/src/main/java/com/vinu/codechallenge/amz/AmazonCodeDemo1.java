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
import java.util.regex.*;
import java.util.stream.Collectors;



class Result {

    /*
     * Complete the 'searchSuggestions' function below.
     *
     * The function is expected to return a 2D_STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY repository
     *  2. STRING customerQuery
     */

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
    // Write your code here
    	List<List<String>> finalList=new ArrayList<List<String>>();
    	if (customerQuery.length() <= 1) {
    		return finalList;
    	}
    	
    	for (int i=2;i<customerQuery.length()+1;i++) {
    		String searchWord=customerQuery.toLowerCase().substring(0,i);
            List<String> suggList=repository.stream()
                            .map(String::toLowerCase)
                            .filter(w -> w.startsWith(searchWord))
                            .sorted((w1,w2) -> w1.compareTo(w2)).limit(3)
                            .collect(Collectors.toList());
            System.out.println("i ="+i+":suggList="+suggList);
            if(suggList.size() > 0)
            finalList.add(suggList);
        }
        return finalList;

    }

}

public class AmazonCodeDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int repositoryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> repository = new ArrayList<>();

        for (int i = 0; i < repositoryCount; i++) {
            String repositoryItem = bufferedReader.readLine();
            repository.add(repositoryItem);
        }

        String customerQuery = bufferedReader.readLine();

        List<List<String>> result = Result.searchSuggestions(repository, customerQuery);

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                bufferedWriter.write(result.get(i).get(j));

                if (j != result.get(i).size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

