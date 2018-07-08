package com.vinu.gui;

import java.applet.Applet;
import java.awt.*;

public class AppletHouse extends Applet{
	
	public void paint(Graphics g) {
		
		g.drawRect(10, 30, 20, 20);
		g.drawLine(10, 30, 20, 40);
		g.drawLine(20, 40, 30, 30);
		g.draw3DRect(100, 200, 100, 150, true);
		
	}
}
