package com.vinu.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


public class LoginForm extends JFrame implements ActionListener
{

	private JLabel uLbl,pLbl,heading1,heading2;
	private JTextField uTxtFld;
	private JPasswordField passFld;
	private JButton logBtn;
	private JPanel pnl;
	public JLabel msgBar;
	private Font f1=new Font("Trebuchet MS",Font.BOLD,60);
	private Font f2=new Font("Monotype Corsiva",Font.BOLD,30);
	String message="Please enter details";

public LoginForm(String msg)
{
	
	super("JESSUP'S -MANUFACTURER OF ELECTRONIC GOODS");
	pnl=new JPanel();
	pnl.setLayout(null);
	getContentPane().add(pnl);
	
	
	uLbl=new JLabel("USERNAME");
	uLbl.setBounds(100,200,100,20);
	pnl.add(uLbl);

	uTxtFld=new JTextField(20);
	uTxtFld.setBounds(250,200,200,20);
	uTxtFld.setToolTipText("Enter the UserName");
	pnl.add(uTxtFld);

	pLbl=new JLabel("PASSWORD");
	pLbl.setBounds(100,240,100,20);
	pnl.add(pLbl);

	passFld=new JPasswordField(20);
	passFld.setBounds(250,240,200,20);
	passFld.setToolTipText("Enter the Password");
	pnl.add(passFld);

	logBtn=new JButton("LOGIN");
	logBtn.setBounds(300,300,100,30);
	logBtn.addActionListener(this);
	pnl.add(logBtn);
	
	//** Modified to add message area...
	
	msgBar= new JLabel(msg);
	msgBar.setBounds(250, 350, 250, 20);
	pnl.add(msgBar);
	
	heading1=new JLabel("JESSUP'S ELECTRONICS");
	heading1.setFont(f1);
	heading1.setForeground(Color.CYAN);
	heading1.setBounds(90,40,750,50);
	pnl.add(heading1);
	
	heading2=new JLabel("************Satisfaction Guaranteed************");
	heading2.setFont(f2);
	heading2.setForeground(Color.ORANGE);
	heading2.setBounds(70,100,700,40);
	pnl.add(heading2);
	
	
	setSize(800,600);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	setVisible(true);
	

}

public void actionPerformed(ActionEvent e)
{
System.out.println(e.getActionCommand());
JButton src=(JButton)e.getSource();
if(src==logBtn)
{
	WriteFile wf=new WriteFile();
	setVisible(false);
	wf.writeToFile();
	if ( ( (uTxtFld.getText()).equals("admin"))&&( (String.valueOf(passFld.getPassword())).equals("password")))
	{
		//new LoginForm("Password Verified OK");
		MainForm obj=new MainForm();
		obj.setSize(800,600);
		obj.setVisible(true);
	}
	else
	{
		message="Invalid Credentials!!";
		pnl.add(msgBar);
		new LoginForm(message);
		//msgBar.setText("Invalid Credentials!!");
	}
}
}



class WriteFile
{
public  void writeToFile()
{
File f=new File("D:/date.txt");
try
{
RandomAccessFile rf=new RandomAccessFile(f,"rw");
rf.seek(rf.length());
Date date=new Date();
GregorianCalendar cal=new GregorianCalendar();
cal.setTime(date);

String instance="LOGIN BY:"+uTxtFld.getText()+"DATE:"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.DATE)+"/"+cal.get(Calendar.YEAR)+"TIME:"
		+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);

rf.writeBytes(instance);
rf.close();
}

catch(IOException i)
{

System.out.println("Unable to write");
}

}
}
public static void main(String a[])
{

new LoginForm("");
}
}
