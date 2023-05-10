package com.encora.qa.employee.view;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.encora.qa.employee.controler.EmployeeHandler;

public class EmployeeFrame extends Frame {
	
	//Variables Creation
	private Label EmployeeIdLbl;
	private TextField EmployeeIdTF;
	private Label EmployeeNameLbl;
	private TextField EmployeeNameTF;
	private Label EmployeeGenderLbl;
	private Checkbox MaleOption;
	private Checkbox FemaleOption;
	private Checkbox OtherOption;
	private CheckboxGroup GenderGroup;
	private Label EmployeePerksLbl;
	private Checkbox pfOption;
	private Checkbox graduityOption;
	private Checkbox mealCardOption;
	private Checkbox npsOption;
	private Checkbox mediClaimOption;
	private Label EmpOfcLocLbl;
	private Choice LocationOption;
	private Label EmployeeAddressLbl;
	private TextArea EmployeeAddressTA;
	private Label EmployeeSalaryLbl;
	private TextField EmployeeSalaryTF;
	
	//Frame creation with fields, set bounds and color
	public EmployeeFrame(boolean visible,String Title, int X, int Y, int Width, int Height){
		this.setVisible(visible);
		this.setTitle(Title);
		this.setBounds(X, Y, Width, Height);
		this.setBackground(Color.blue);
		this.setLayout(null);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				EmployeeFrame Frame=(EmployeeFrame)e.getSource();
				Frame.dispose();
			}//window closing
		}); //Window Adapter class closing
		
		//Labels & Corresponding Fields
		EmployeeIdLbl = new Label("Employee ID:");
		EmployeeIdLbl.setBounds(20, 50, 120, 20);
		add(EmployeeIdLbl);
		
		EmployeeIdTF = new TextField();
		EmployeeIdTF.setBounds(140, 50, 120, 20);
		add(EmployeeIdTF);
		
		EmployeeNameLbl = new Label("Employee Name:");
		EmployeeNameLbl.setBounds(20, 90, 120, 20);
		add(EmployeeNameLbl);
		
		EmployeeNameTF = new TextField();
		EmployeeNameTF.setBounds(140, 90, 120, 20);
		add(EmployeeNameTF);
		
		EmployeeGenderLbl = new Label("Employee Gender:");
		EmployeeGenderLbl.setBounds(20, 130, 120, 20);
		add(EmployeeGenderLbl);
		
		GenderGroup = new CheckboxGroup();
		
		MaleOption = new Checkbox("Male", false, GenderGroup);
		MaleOption.setBounds(140, 130, 50, 20);
		add(MaleOption);
		
		FemaleOption = new Checkbox("Female",true,GenderGroup);
		FemaleOption.setBounds(220, 130, 70, 20);
		add(FemaleOption);
		
		OtherOption = new Checkbox("Other",false, GenderGroup);
		OtherOption.setBounds(290, 130, 50, 20);
		add(OtherOption);
		
		EmployeePerksLbl = new Label("Employee Perks:");
		EmployeePerksLbl.setBounds(20, 170, 120, 20);
		add(EmployeePerksLbl);
		
		pfOption = new Checkbox("PF");
		pfOption.setBounds(140, 170, 30, 20);
		add(pfOption);
		
		mealCardOption = new Checkbox("Meal Card");
		mealCardOption.setBounds(210, 170, 80, 20);
		add(mealCardOption);
		
		graduityOption = new Checkbox("Graduity");
		graduityOption.setBounds(310, 170, 80, 20);
		add(graduityOption);
		
		npsOption = new Checkbox("NPS");
		npsOption.setBounds(410, 170, 50, 20);
		add(npsOption);
		
		mediClaimOption = new Checkbox("Medi Claim");
		mediClaimOption.setBounds(470, 170, 80, 20);
		add(mediClaimOption);
		
		EmpOfcLocLbl = new Label("Emp. Office Loc.:");
		EmpOfcLocLbl.setBounds(20, 200, 150, 20);
		add(EmpOfcLocLbl);
		
		LocationOption = new Choice();
		LocationOption.add("Visakhapatnam");
		LocationOption.add("Pune");
		LocationOption.add("Hyderabad");
		LocationOption.add("Banglore");
		LocationOption.add("Vijaywada");
		LocationOption.setBounds(190, 200, 150, 20);
		add(LocationOption);
		
		EmployeeAddressLbl = new Label("Employee Address:");
		EmployeeAddressLbl.setBounds(370, 200, 100, 20);
		add(EmployeeAddressLbl);
		
		EmployeeAddressTA = new TextArea();
		EmployeeAddressTA.setBounds(500, 200, 150, 100);
		add(EmployeeAddressTA);
		
		EmployeeSalaryLbl = new Label("Employee Salary:");
		EmployeeSalaryLbl.setBounds(20, 320, 80, 20);
		add(EmployeeSalaryLbl);
		
		EmployeeSalaryTF = new TextField();
		EmployeeSalaryTF.setBounds(120, 320, 80, 20);
		add(EmployeeSalaryTF);
		
		//Buttons Creation
		Button Savebtn = new Button("Save");
		Savebtn.setBounds(40, 370, 40, 20);
		add(Savebtn);
		Savebtn.addActionListener(new EmployeeHandler());
		
		Button Searchbtn = new Button("Search");
		Searchbtn.setBounds(90, 370, 50, 20);
		add(Searchbtn);
		Searchbtn.addActionListener(new EmployeeHandler());
		
		Button UpdateBtn = new Button("Update");
		UpdateBtn.setBounds(150, 370, 50, 20);
		add(UpdateBtn);
		UpdateBtn.addActionListener(new EmployeeHandler());
		
		Button DeletBtn = new Button("Delete");
		DeletBtn.setBounds(210, 370, 50, 20);
		add(DeletBtn);
		DeletBtn.addActionListener(new EmployeeHandler());
		
		Button Firstbtn = new Button("First");
		Firstbtn.setBounds(40, 400, 40, 20);
		add(Firstbtn);
		Firstbtn.addActionListener(new EmployeeHandler());
		
		Button Nextbtn = new Button("Next");
		Nextbtn.setBounds(90, 400, 50, 20);
		add(Nextbtn);
		Nextbtn.addActionListener(new EmployeeHandler());
		
		Button PrevBtn = new Button("Prev");
		PrevBtn.setBounds(150, 400, 50, 20);
		add(PrevBtn);
		PrevBtn.addActionListener(new EmployeeHandler());
		
		Button LastBtn = new Button("Last");
		LastBtn.setBounds(210, 400, 50, 20);
		add(LastBtn);
		LastBtn.addActionListener(new EmployeeHandler());
	}//Employee() close

}//Class Close
