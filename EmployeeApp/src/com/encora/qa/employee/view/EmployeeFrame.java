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
	public TextField emp_contact;
	
	//Frame creation with fields, set bounds and color
	public EmployeeFrame(boolean visible,String Title, int X, int Y, int Width, int Height){
		this.setVisible(visible);
		this.setTitle(Title);
		this.setBounds(X, Y, Width, Height);
		this.setBackground(Color.LIGHT_GRAY);
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
		Savebtn.addActionListener(new EmployeeHandler(this));
		
		Button Searchbtn = new Button("Search");
		Searchbtn.setBounds(90, 370, 50, 20);
		add(Searchbtn);
		Searchbtn.addActionListener(new EmployeeHandler(this));
		
		Button UpdateBtn = new Button("Update");
		UpdateBtn.setBounds(150, 370, 50, 20);
		add(UpdateBtn);
		UpdateBtn.addActionListener(new EmployeeHandler(this));
		
		Button DeletBtn = new Button("Delete");
		DeletBtn.setBounds(210, 370, 50, 20);
		add(DeletBtn);
		DeletBtn.addActionListener(new EmployeeHandler(this));
		
		Button Firstbtn = new Button("First");
		Firstbtn.setBounds(40, 400, 40, 20);
		add(Firstbtn);
		Firstbtn.addActionListener(new EmployeeHandler(this));
		
		Button Nextbtn = new Button("Next");
		Nextbtn.setBounds(90, 400, 50, 20);
		add(Nextbtn);
		Nextbtn.addActionListener(new EmployeeHandler(this));
		
		Button PrevBtn = new Button("Prev");
		PrevBtn.setBounds(150, 400, 50, 20);
		add(PrevBtn);
		PrevBtn.addActionListener(new EmployeeHandler(this));
		
		Button LastBtn = new Button("Last");
		LastBtn.setBounds(210, 400, 50, 20);
		add(LastBtn);
		LastBtn.addActionListener(new EmployeeHandler(this));
	}//Employee() close
	
	//Getters & Setters to access private variables out side the class

	public Label getEmployeeIdLbl() {
		return EmployeeIdLbl;
	}

	public void setEmployeeIdLbl(Label employeeIdLbl) {
		EmployeeIdLbl = employeeIdLbl;
	}

	public TextField getEmployeeIdTF() {
		return EmployeeIdTF;
	}

	public void setEmployeeIdTF(TextField employeeIdTF) {
		EmployeeIdTF = employeeIdTF;
	}

	public Label getEmployeeNameLbl() {
		return EmployeeNameLbl;
	}

	public void setEmployeeNameLbl(Label employeeNameLbl) {
		EmployeeNameLbl = employeeNameLbl;
	}

	public TextField getEmployeeNameTF() {
		return EmployeeNameTF;
	}

	public void setEmployeeNameTF(TextField employeeNameTF) {
		EmployeeNameTF = employeeNameTF;
	}

	public Label getEmployeeGenderLbl() {
		return EmployeeGenderLbl;
	}

	public void setEmployeeGenderLbl(Label employeeGenderLbl) {
		EmployeeGenderLbl = employeeGenderLbl;
	}

	public Checkbox getMaleOption() {
		return MaleOption;
	}

	public void setMaleOption(Checkbox maleOption) {
		MaleOption = maleOption;
	}

	public Checkbox getFemaleOption() {
		return FemaleOption;
	}

	public void setFemaleOption(Checkbox femaleOption) {
		FemaleOption = femaleOption;
	}

	public Checkbox getOtherOption() {
		return OtherOption;
	}

	public void setOtherOption(Checkbox otherOption) {
		OtherOption = otherOption;
	}

	public CheckboxGroup getGenderGroup() {
		return GenderGroup;
	}

	public void setGenderGroup(CheckboxGroup genderGroup) {
		GenderGroup = genderGroup;
	}

	public Label getEmployeePerksLbl() {
		return EmployeePerksLbl;
	}

	public void setEmployeePerksLbl(Label employeePerksLbl) {
		EmployeePerksLbl = employeePerksLbl;
	}

	public Checkbox getPfOption() {
		return pfOption;
	}

	public void setPfOption(Checkbox pfOption) {
		this.pfOption = pfOption;
	}

	public Checkbox getGraduityOption() {
		return graduityOption;
	}

	public void setGraduityOption(Checkbox graduityOption) {
		this.graduityOption = graduityOption;
	}

	public Checkbox getMealCardOption() {
		return mealCardOption;
	}

	public void setMealCardOption(Checkbox mealCardOption) {
		this.mealCardOption = mealCardOption;
	}

	public Checkbox getNpsOption() {
		return npsOption;
	}

	public void setNpsOption(Checkbox npsOption) {
		this.npsOption = npsOption;
	}

	public Checkbox getMediClaimOption() {
		return mediClaimOption;
	}

	public void setMediClaimOption(Checkbox mediClaimOption) {
		this.mediClaimOption = mediClaimOption;
	}

	public Label getEmpOfcLocLbl() {
		return EmpOfcLocLbl;
	}

	public void setEmpOfcLocLbl(Label empOfcLocLbl) {
		EmpOfcLocLbl = empOfcLocLbl;
	}

	public Choice getLocationOption() {
		return LocationOption;
	}

	public void setLocationOption(Choice locationOption) {
		LocationOption = locationOption;
	}

	public Label getEmployeeAddressLbl() {
		return EmployeeAddressLbl;
	}

	public void setEmployeeAddressLbl(Label employeeAddressLbl) {
		EmployeeAddressLbl = employeeAddressLbl;
	}

	public TextArea getEmployeeAddressTA() {
		return EmployeeAddressTA;
	}

	public void setEmployeeAddressTA(TextArea employeeAddressTA) {
		EmployeeAddressTA = employeeAddressTA;
	}

	public Label getEmployeeSalaryLbl() {
		return EmployeeSalaryLbl;
	}

	public void setEmployeeSalaryLbl(Label employeeSalaryLbl) {
		EmployeeSalaryLbl = employeeSalaryLbl;
	}

	public TextField getEmployeeSalaryTF() {
		return EmployeeSalaryTF;
	}

	public void setEmployeeSalaryTF(TextField employeeSalaryTF) {
		EmployeeSalaryTF = employeeSalaryTF;
	}

	public TextField getEmp_contact() {
		return emp_contact;
	}

	public void setEmp_contact(TextField emp_contact) {
		this.emp_contact = emp_contact;
	}

	
}//Class Close
