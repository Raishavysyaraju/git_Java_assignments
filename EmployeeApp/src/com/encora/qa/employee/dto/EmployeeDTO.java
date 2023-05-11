package com.encora.qa.employee.dto;

public class EmployeeDTO {

	private int EmployeeID;
	private String EmployeeName;
	private String Gender;
	private boolean PF;
	private boolean NPS;
	private boolean Graduity;
	private boolean MealCard;
	private boolean Mediclaim;
	private String OfcLocation;
	private String Address;
	private int Salary;
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public boolean isPF() {
		return PF;
	}
	public void setPF(boolean pF) {
		PF = pF;
	}
	public boolean isNPS() {
		return NPS;
	}
	public void setNPS(boolean nPS) {
		NPS = nPS;
	}
	public boolean isGraduity() {
		return Graduity;
	}
	public void setGraduity(boolean graduity) {
		Graduity = graduity;
	}
	public boolean isMealCard() {
		return MealCard;
	}
	public void setMealCard(boolean mealCard) {
		MealCard = mealCard;
	}
	public boolean isMediclaim() {
		return Mediclaim;
	}
	public void setMediclaim(boolean mediclaim) {
		Mediclaim = mediclaim;
	}
	public String getOfcLocation() {
		return OfcLocation;
	}
	public void setOfcLocation(String ofcLocation) {
		OfcLocation = ofcLocation;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", Gender=" + Gender
				+ ", PF=" + PF + ", NPS=" + NPS + ", Graduity=" + Graduity + ", MealCard=" + MealCard + ", Mediclaim="
				+ Mediclaim + ", OfcLocation=" + OfcLocation + ", Address=" + Address + ", Salary=" + Salary + "]";
	}
	
}
