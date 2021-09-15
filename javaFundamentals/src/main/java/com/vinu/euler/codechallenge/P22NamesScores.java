/**
 * 
 */
package com.vinu.euler.codechallenge;

import java.util.*;
import java.io.IOException;
import java.nio.file.*;

/**
 * @author Vinu Prabhakaran
 *         on Aug 24, 2021
 *
 */
/*Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, 
multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53,
is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?*/
public class P22NamesScores {
	public static void main(String[] args) throws IOException {
		
		Path p1=Paths.get("src/main/resources/p022_names.txt");
		Map<String,Integer> names=new TreeMap<>();
		Files.lines(p1).forEach(l -> {
			String[] nameArr = l.replace("\"", "").split(",");
			Arrays.sort(nameArr);
			for (int i=0;i<nameArr.length;i++) {
				names.put(nameArr[i], i+1);
			}
		});
		System.out.println(names);
		
		System.out.println((int)'A'); //65
		System.out.println(getScore("COLIN"));
		Collection<String> values = names.keySet();
		int sum=0;
		for(Iterator<String>i=values.iterator();i.hasNext();){
			String name=i.next();
			sum+=(getScore(name)*names.get(name));
		}
		
		System.out.println("Answer is :"+sum);
	}
	
	public static int getScore(String name) {
		
		int len=name.length(),score=0;
		for (int i=0;i<len;i++) {
			score+=((int)name.charAt(i) - 64);
		}
		return score; 
	}
}
