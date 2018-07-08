package com.vinu.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class ActionTester extends JFrame implements ActionListener{
	int clickCount=0;
	JLabel lbl;
	String str = "Number of clicks = ";
	
	public ActionTester()
	{
		super("Action Testing");
		
		JPanel myPanel= new JPanel();
		getContentPane().add(myPanel);
		myPanel.setLayout(null);
		
		JButton b1,b2;
					
		b1= new JButton("ClickMe");
		b1.addActionListener(this);
		b1.setBounds(40, 20, 80, 20);
		myPanel.add(b1);
		
		b2= new JButton("Quit");
		b2.addActionListener(this);
		b2.setBounds(130, 20, 80, 20);	
		myPanel.add(b2);
		
		lbl = new JLabel(str+clickCount);
		lbl.setBounds(40, 90, 130, 10);
		myPanel.add(lbl);
		
		setSize(250,200);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String actType = e.getActionCommand();
		JButton ob = (JButton)e.getSource();
		if (actType.equals("ClickMe") || actType.equals("Clicked"))
		{
			clickCount++;
			lbl.setText(str+clickCount);
			ob.setText("Clicked");
			System.out.println("Count is "+clickCount);
		}
		else if(actType.equals("Quit"))
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionTester at = new ActionTester();
		at.setVisible(true);
		at.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
