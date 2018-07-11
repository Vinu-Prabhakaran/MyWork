package com.vinu.gui;

import java.applet.Applet;
//import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*<applet code="com.vinu.gui.HomeApplet" width=400 height=300></applet> */
public class HomeApplet extends Applet {

	Font f = new Font("Helvetica",Font.BOLD+Font.ITALIC,30);
	Font f1 = new Font("Helvetica",Font.ITALIC,20);
	
	public void paint(Graphics g) {
		g.setFont(f);
		g.drawString("MoneySaver Corporation",100,100);
		g.setFont(f1);
		g.drawString("This is a new bank", 40, 150);
	}
}
