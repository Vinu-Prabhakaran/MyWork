/**
 * 
 */
package com.vinu.learn;

/**
 * @author Vinu Prabhakaran
 *
 */
public class Account {
	int acc_Num;
	String acc_Name;
	int acc_Age;
	double acc_Bal;
	
	public Account()
	{
		this.acc_Num = 1234;
		this.acc_Bal = 100.00;
		this.acc_Name = "Vinu Prabhakaran";
		this.acc_Age = 33;
	}
	
	public void showDetails()
	{
		System.out.println("Account # 	: "+ acc_Num);
		System.out.println("Account Holder 	: "+ acc_Name);
		System.out.println("Holder's Age	: "+ acc_Age);
		System.out.println("Account Balance	: "+ acc_Bal);
	}

	public static void main(String args[])
	{
		Account a1 = new Account();
		System.out.println("New account created with below details");
		a1.showDetails();
	}
}
