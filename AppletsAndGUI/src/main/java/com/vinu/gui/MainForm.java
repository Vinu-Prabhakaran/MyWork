package com.vinu.gui;

import javax.swing.*;
import java.awt.event.*;

public class MainForm extends JFrame implements ActionListener

{
	
	private JMenu accountMenu;
    	private JMenu reportsMenu;
	private JMenu salesMenu;
    	private JMenuBar mainMenubar;
	private JMenuItem newSales;
	private JMenuItem newPromoScheme;
    	private JMenuItem newEmployee;
    	private JMenuItem newProduct;
    	private JMenuItem newSalesRep;
    	private JMenuItem newScheme;
    	private JMenuItem newWholeSaler;
    	private JMenu productMenu;
	private JMenuItem exitpgm;
    
	/** Creates new form MainForm */
	public MainForm() 
	{
		initComponents();
    	}
    
	private void initComponents() 
	{
		mainMenubar = new JMenuBar();
		accountMenu = new JMenu();
		newWholeSaler = new JMenuItem();
		newEmployee = new JMenuItem();
		newSalesRep = new JMenuItem();
		productMenu = new JMenu();
		newProduct = new JMenuItem();
		newScheme = new JMenuItem();
		reportsMenu = new JMenu();
		exitpgm = new JMenuItem();
		salesMenu=new JMenu();
		newSales=new JMenuItem();
		newPromoScheme=new JMenuItem();
		

		getContentPane().setLayout(null);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Welcome!");
		accountMenu.setText("Create Account");
		accountMenu.setToolTipText("Create new accounts");
		
   


		newWholeSaler.setText("New Wholesaler");
		newWholeSaler.setToolTipText("Creates new account for a wholesaler");
		newWholeSaler.addActionListener(this);
		accountMenu.add(newWholeSaler);
                	

		newEmployee.setText("New Employee");
		newEmployee.setToolTipText("Creates new account for an employee");
		newEmployee.addActionListener(this);
		accountMenu.add(newEmployee);

		newSalesRep.setText("New Sales Representative");
		newSalesRep.setToolTipText("Creates new acoount for a Sales Representative");
		newSalesRep.addActionListener(this);
		accountMenu.add(newSalesRep);

		mainMenubar.add(accountMenu);

		productMenu.setText("Products");
		productMenu.setToolTipText("Products Information");
		newProduct.setText("New Product");
		newProduct.setToolTipText("Creates new product portfolio");
		productMenu.add(newProduct);
		newProduct.addActionListener(this);

        newScheme.setText("New Product Scheme");
		newScheme.setToolTipText("Creates new product promotion Scheme");
		newScheme.addActionListener(this);
		productMenu.add(newScheme);

		mainMenubar.add(productMenu);

		reportsMenu.setText("Reports");
		reportsMenu.setToolTipText("Display Reports");
		mainMenubar.add(reportsMenu);
		
		salesMenu.setText("Sales");
		salesMenu.setToolTipText("Sales Information");

		newSales.setText("New Sales");
		newSales.setToolTipText("Creates new Sales Info");
		salesMenu.add(newSales);
		newSales.addActionListener(this);

		newPromoScheme.setText("New Promotional Scheme");
		newPromoScheme.setToolTipText("Creates new Promotional Scheme");
		salesMenu.add(newPromoScheme);
		newPromoScheme.addActionListener(this);

		
		mainMenubar.add(salesMenu);
  		setJMenuBar(mainMenubar);

        pack();
    	}
	
	public void actionPerformed(ActionEvent evt)
	{
	Object source = evt.getSource();
	if (source == newEmployee)
	{
        System.out.println("Employee Selected");
        Employee sf = new  Employee();
		getContentPane().add(sf);

	}
	}
}