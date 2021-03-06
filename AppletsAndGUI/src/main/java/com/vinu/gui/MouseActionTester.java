package com.vinu.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseActionTester extends JFrame implements MouseListener, ActionListener,
	MouseMotionListener {
	
	JPanel myPanel;
	JLabel myLabel;
	String str;
	
	public MouseActionTester()
	{
		super("Mouse Action Testing");
		
		myPanel = new JPanel();
		myPanel.setLayout(null);
		getContentPane().add(myPanel);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		JButton b1= new JButton("Quit");
		b1.setBounds(200, 30, 100, 20);
		b1.addActionListener(this);
		myPanel.add(b1);
				
		myLabel = new JLabel(str);
		myLabel.setBounds(150, 100, 200, 20);
		myLabel.setAlignmentX(CENTER_ALIGNMENT);
		myPanel.add(myLabel);
		
		setSize(500,500);
		setVisible(true);
	}

   public void mouseClicked(MouseEvent me)
   	{
		System.out.println("Mouse Clicked @"+me.getX()+","+me.getY());
		myLabel.setText("Mouse Clicked @"+me.getX()+","+me.getY());
	}
    /**
     * Invoked when a mouse button has been pressed on a component.
     */
    public void mousePressed(MouseEvent me)
    {
		System.out.println("Mouse Pressed @"+me.getX()+","+me.getY());
		myLabel.setText("Mouse Pressed @"+me.getX()+","+me.getY());
	}
    /**
     * Invoked when a mouse button has been released on a component.
     */
    public void mouseReleased(MouseEvent me)
    {
		System.out.println("Mouse Released @"+me.getX()+","+me.getY());
		myLabel.setText("Mouse Released @"+me.getX()+","+me.getY());
	}
    /**
     * Invoked when the mouse enters a component.
     */
    public void mouseEntered(MouseEvent me)
    {
		System.out.println("Mouse Entered @"+me.getX()+","+me.getY());
		myLabel.setText("Mouse Entered @"+me.getX()+","+me.getY());
	}

    /**
     * Invoked when the mouse exits a component.
     */
    public void mouseExited(MouseEvent me)
    {
		System.out.println("Mouse Exited @"+me.getX()+","+me.getY());
		myLabel.setText("Mouse Exited @"+me.getX()+","+me.getY());
	}
    

    public void mouseDragged(MouseEvent me)
    {
    	myLabel.setText("Mouse Dragged @"+me.getX()+","+me.getY());
    }
     /**
     * Invoked when the mouse cursor has been moved onto a component
     * but no buttons have been pushed.
     */
    public void mouseMoved(MouseEvent me)
    {
    	myLabel.setText("Mouse Moved @"+me.getX()+","+me.getY());
    }
    
	public void actionPerformed(ActionEvent ae)
	{
		String btn = ae.getActionCommand();
		if(btn.equals("Quit"))
		{
			System.out.println("Quiting");
			System.exit(0);
		}
	}
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MouseActionTester mt = new MouseActionTester();
		mt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

}
