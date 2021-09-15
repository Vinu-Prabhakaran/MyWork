/**
 * 
 */
package com.vinu.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 26, 2021
 *
 */
import java.util.*;
/*A valid parentheses string is either empty "", "(" + A + ")", or A + B, 
 * where A and B are valid parentheses strings, and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist 
a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: 
s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

Example 1:
Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

Example 2:
Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

Example 3:
Input: s = "()()"
Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".
 

Constraints:

1 <= s.length <= 105
s[i] is either '(' or ')'.
s is a valid parentheses string.*/
public class RemoveParenthesis {
	
	public static void main(String[] args) {
		String  s = "(()())(())";
		System.out.println(System.currentTimeMillis());
		System.out.println(removeOuterParentheses(s));
		System.out.println(System.currentTimeMillis());

	}
	    public static String removeOuterParentheses(String s) {
	        
	        List<Integer> indices=new ArrayList<>();
	        List<Integer> newIndices=new ArrayList<>();
	        StringBuilder sbOut=new StringBuilder();
	        int sum=0;
	        for (int i=0;i<s.length();i++){
	            
	            if(s.charAt(i) == '('){
	                sum++;
	            }else{
	                sum--;
	            }
	            
	            if((sum==0) // this is a balancing ending ')' 
	            		|| (sum == 1 && indices.size() %2 == 0) //new starting '('
	            		){
	                indices.add(i);
	            }else {
	            	sbOut.append(s.charAt(i));
	            }
	           
	        }
	        
	        System.out.println("Indices to be removed:"+indices);
	        /*for(int i=0;i<indices.size();i++){
	            newIndices.add(indices.get(i)-i);
	        }
	            
	        StringBuilder sb=new StringBuilder(s);
	        for(int i: newIndices){
	            sb.deleteCharAt(i);
	        }*/
	        return sbOut.toString();
	    }
}
