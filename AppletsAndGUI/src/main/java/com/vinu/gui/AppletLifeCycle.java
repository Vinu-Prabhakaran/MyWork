package com.vinu.gui;

import java.applet.Applet;
import java.awt.*;

public class AppletLifeCycle extends Applet {
	
	String str="Hello";
	public void init() {
		str+="<init()";
	}
	
	public void start() {
		str+="<start()";
	}
	
	public void stop() {
		str+="<stop()";
	}
	
	public void destroy() {
		str+="<destroy()";
	}

	public void paint(Graphics g) {
		str+="<paint()";
		g.drawString(str,30,30);
	}


}
