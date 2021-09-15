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
/*HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100 .
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3 , round grade up to the next multiple of 5.
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
Examples

grade=84 round to 85 (85 - 84 is less than 3)
grade=29 do not round (result is less than 40)
grade=57 do not round (60 - 57 is 3 or higher)
Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
*/
class GradeStudentsResult {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    	List<Integer> rounded=new ArrayList<>();
    	List<Integer> result=new ArrayList<>();
    	grades.forEach(g -> {
    		
    		if (g%10 >= 1 && g%10 <=5) {
    			rounded.add((g/10)*10 + 5);
    		}else if(g%10 > 5) {
    			rounded.add((g/10)*10 + 10);
    		}else {
    			rounded.add(g);
    		}
    	});
    	System.out.println(grades);
    	System.out.println(rounded);
    	for (int i=0;i<grades.size();i++) {
    		if (grades.get(i) <= 37) {
    			result.add(grades.get(i));
    		}else if (rounded.get(i) ==40) {
    			result.add(rounded.get(i));
    		} else if(rounded.get(i) - grades.get(i) < 3) {
    			result.add(rounded.get(i));
    		} else {
    			result.add(grades.get(i));
    		}
    	}
    	return  result;

    }

}

public class GradeStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = GradeStudentsResult.gradingStudents(grades);

        System.out.print(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
