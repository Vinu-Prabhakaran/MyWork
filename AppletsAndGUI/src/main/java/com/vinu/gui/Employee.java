package com.vinu.gui;

import javax.swing.*;
import java.awt.event.*;
import  java.awt.*;

public class Employee  extends JInternalFrame implements ActionListener
{
	JLabel name,region,fname,lname,department,designation,address,city,state,zipcode,phone,email_id,password;
	JTextField tname,tregion,tfname,tlname,tdepartment,tdesignation,taddress,tcity,tstate,tzipcode,tphone,temail_id;
	JPasswordField tpassword;
	JPanel pnl;
	JButton submit,reset;
	
	public Employee()
	{
		super("NewEmployee",true,true,true,true);
		pnl=new JPanel();
		getContentPane().add(pnl);
		pnl.setLayout(null);
		
		name=new JLabel("Employee Id");
		name.setBounds(10,50,100,20);
		pnl.add(name);

		tname=new JTextField(20);
		tname.setBounds(120,50,100,20);
		pnl.add(tname);
	
		region=new JLabel("Region");
		region.setBounds(250,50,50,20);
		pnl.add(region);

		tregion=new JTextField(20);
		tregion.setBounds(360,50,100,20);
		pnl.add(tregion);
		
		fname=new JLabel("First Name");
		fname.setBounds(10,90,100,20);
		pnl.add(fname);

		tfname=new JTextField(20);
		tfname.setBounds(120,90,100,20);
		pnl.add(tfname);
		
		lname=new JLabel("Last Name");
		lname.setBounds(250,90,100,20);
		pnl.add(lname);

		tlname=new JTextField(20);
		tlname.setBounds(360,90,100,20);
		pnl.add(tlname);

		department=new JLabel("Department");
		department.setBounds(10,130,100,20);
		pnl.add(department);

		tdepartment=new JTextField(20);
		tdepartment.setBounds(120,130,100,20);
		pnl.add(tdepartment);
		
		designation=new JLabel("Designation");
		designation.setBounds(250,130,100,20);
		pnl.add(designation);

		tdesignation=new JTextField(20);
		tdesignation.setBounds(360,130,100,20);
		pnl.add(tdesignation);
		
		address=new JLabel("Address");
		address.setBounds(10,170,100,20);
		pnl.add(address);

		taddress=new JTextField(20);
		taddress.setBounds(120,170,340,20);
		pnl.add(taddress);
	
		city=new JLabel("City");
		city.setBounds(250,210,100,20);
		pnl.add(city);

		tcity=new JTextField(20);
		tcity.setBounds(360,210,100,20);
		pnl.add(tcity);
	
		state=new JLabel("State");
		state.setBounds(10,210,100,20);
		pnl.add(state);

		tstate=new JTextField(20);
		tstate.setBounds(120,210,100,20);
		pnl.add(tstate);

		zipcode=new JLabel("Zipcode");
		zipcode.setBounds(250,250,100,20);
		pnl.add(zipcode);

		tzipcode=new JTextField(20);
		tzipcode.setBounds(360,250,100,20);
		pnl.add(tzipcode);
		
		phone=new JLabel("Phone Number");
		phone.setBounds(10,250,100,20);
		pnl.add(phone);

		tphone=new JTextField(20);
		tphone.setBounds(120,250,100,20);
		pnl.add(tphone);
	
		email_id=new JLabel("Email ID");
		email_id.setBounds(10,290,100,20);
		pnl.add(email_id);

		temail_id=new JTextField(20);
		temail_id.setBounds(120,290,100,20);
		pnl.add(temail_id);
		
		password=new JLabel("Password");
		password.setBounds(250,290,100,20);
		pnl.add(password);

		tpassword=new JPasswordField(20);
		tpassword.setBounds(360,290,100,20);
		pnl.add(tpassword);

		submit=new JButton(" SUBMIT ");
		submit.setBounds(120,330,90,20);
		submit.addActionListener(this);
		pnl.add(submit);
		
		reset=new JButton(" RESET ");
		reset.setBounds(230,330,90,20);
		reset.addActionListener(this);
		pnl.add(reset);
		
		setSize(500,500);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == submit)
		{
			System.out.println("Submitted");
		}	
	}
			
}
	