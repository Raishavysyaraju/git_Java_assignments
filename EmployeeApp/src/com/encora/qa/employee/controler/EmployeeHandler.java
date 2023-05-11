package com.encora.qa.employee.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.encora.qa.employee.dto.EmployeeDTO;
import com.encora.qa.employee.view.EmployeeFrame;

public class EmployeeHandler implements ActionListener {
	EmployeeFrame ef;
	
	public EmployeeHandler(EmployeeFrame employeeFrame) {
				// TODO Auto-generated constructor stub
		ef=employeeFrame;
	}
	
	public EmployeeDTO getEmployeeData(EmployeeFrame ef) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmployeeID(Integer.parseInt(ef.getEmployeeIdTF().getText()));
		dto.setEmployeeName(ef.getEmployeeNameTF().getText());
		dto.setGender(ef.getGenderGroup().getSelectedCheckbox().getLabel());
		dto.setPF(ef.getPfOption().getState());
		dto.setPF(ef.getNpsOption().getState());
		dto.setPF(ef.getMealCardOption().getState());
		dto.setPF(ef.getMediClaimOption().getState());
		dto.setPF(ef.getGraduityOption().getState());
		dto.setOfcLocation(ef.getLocationOption().getSelectedItem());
		dto.setAddress(ef.getEmployeeAddressTA().getText());
		dto.setSalary( Integer.parseInt(ef.getEmployeeSalaryTF().getText()));
		System.out.println(dto);
		return dto;
		
	/*	int empid=Integer.parseInt(ef.getEmployeeIdTF().getText()) ;
		String empname = ef.getEmployeeNameTF().getText();
		String GenderSelected = ef.getGenderGroup().getSelectedCheckbox().getLabel();
		//System.out.println(GenderSelected);
		boolean pfoption = ef.getPfOption().getState();
		boolean npfoption = ef.getNpsOption().getState();
		boolean mealoption = ef.getMealCardOption().getState();
		boolean medioption = ef.getMediClaimOption().getState();
		boolean graduityoption = ef.getGraduityOption().getState();
		String location = ef.getLocationOption().getSelectedItem();
		String address = ef.getEmployeeAddressTA().getText();
		int salary = Integer.parseInt(ef.getEmployeeSalaryTF().getText());*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String btnclicked = e.getActionCommand().toLowerCase();
		
		switch(btnclicked) {
		case "save":
			getEmployeeData(ef);
			break;
		case "search":
			break;
			
		case "update":
			getEmployeeData(ef);
			break;
		case "delete":
			
		}
		
	}

}
