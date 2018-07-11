/**
 * 
 */
package com.vinu.learn;

/**
 * @author Vinu
 * To display the arguments passed
 */
public class DispArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		if (args.length == 0)
		{
			System.out.println("No arguments passed...");
		}
		else
		{
			for (i=0;i<args.length;i++)
			{
				System.out.println("Argument "+i+" is "+args[i]);
			}
		}
	}

}
