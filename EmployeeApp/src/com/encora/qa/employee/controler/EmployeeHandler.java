package com.encora.qa.employee.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String btnclicked = e.getActionCommand().toLowerCase();
		switch(btnclicked) {
		case "save":
		case "search":
		case "update":
		case "delete":
			
		}
		
	}

}
