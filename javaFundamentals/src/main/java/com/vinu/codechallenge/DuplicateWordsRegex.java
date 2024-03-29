/**
 * 
 */
package com.vinu.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 14, 2021
 *
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordsRegex {
	/*Sample Input

	5
	Goodbye bye bye world world world
	Sam went went to to to his business
	Reya is is the the best player in eye eye game
	in inthe
	Hello hello Ab aB
	Sample Output

	Goodbye bye world
	Sam went to his business
	Reya is the best player in eye game
	in inthe
	Hello Ab*/

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1)+\\b";
        /*
        \b start of word word boundary
        \W+ any word character
        \1 same word matched already
        \b end of word
        ()* Repeating again
        () are used for grouping of regex phrases.

        Listgroup(1) contains the string that is between parenthesis (.) so . Item
        m.group(0) contains whole matched string.
        */
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE + Pattern.MULTILINE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
