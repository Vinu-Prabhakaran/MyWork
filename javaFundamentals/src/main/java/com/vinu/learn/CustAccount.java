package com.vinu.learn;

public class CustAccount {
	
	private double principal,interestRate,time,amt;
	
	public void dispAmount() 
	{
		amt=principal + ((principal*interestRate*time)/100);
		System.out.println("Matured Amount is "+amt);
	}
	
	public double calcAmount() 
	{
		amt=principal + ((principal*interestRate*time)/100);
		return amt;
	}
	
	void setCustAccount(double principal,double interestRate,double time)
	{
		this.principal=principal;
		this.interestRate=interestRate;
		this.time=time;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustAccount a1=new CustAccount();
		a1.setCustAccount(1200, 8.75, 2);
		a1.dispAmount();
		CustAccount a2 = new CustAccount();
		a2.setCustAccount(1500, 9.5, 5);
		System.out.println("Matured amount is "+a2.calcAmount());
	}

}
