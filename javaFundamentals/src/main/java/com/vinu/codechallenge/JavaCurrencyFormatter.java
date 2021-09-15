/**
 * 
 */
package com.vinu.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 8, 2021
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*Given a double-precision number,payment , denoting an amount of money, use the NumberFormat class' 
getCurrencyInstance method to convert payment  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where formattedPayment is payment formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
*/
public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale in=new Locale("en", "IN");
        NumberFormat usCurrFormatter=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat inCurrFormatter=NumberFormat.getCurrencyInstance(in);
        NumberFormat cnCurrFormatter=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frCurrFormatter=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        // Write your code here.
        
        System.out.println("US: " + usCurrFormatter.format(payment));
        System.out.println("India: " + inCurrFormatter.format(payment));
        System.out.println("China: " + cnCurrFormatter.format(payment));
        System.out.println("France: " + frCurrFormatter.format(payment));
    }
}