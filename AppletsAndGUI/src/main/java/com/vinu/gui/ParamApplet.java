package com.vinu.gui;

import java.applet.Applet;
import java.awt.Graphics;

/*<applet code="com.vinu.gui.ParamApplet" 
 <param name="name" value="Vinu" >
  <param name="age" value="33" >
  </applet>
 */

public class ParamApplet extends Applet{
	
	String nme;
	String ag;
	public void init()
	{
		nme = getParameter("name");
		ag=getParameter("age");
	}
	
	public void paint(Graphics g) {
		g.drawString(nme+" is "+ag+" years old", 50, 50);
	}
}
