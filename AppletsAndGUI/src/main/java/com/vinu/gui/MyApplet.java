package com.vinu.gui;

import java.applet.Applet;
import java.awt.Graphics;
/* <applet code="MyApplet.class" height=300 width=250></applet> */
public class MyApplet extends Applet {
	public void paint(Graphics g) {
		g.drawString("Helo!This is my first applet after 12 years", 50, 100);
	}
}
