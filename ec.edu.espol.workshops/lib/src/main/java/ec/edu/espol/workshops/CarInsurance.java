package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {
private int customerage;
private String customerGender;
private String civilStatus;
private boolean isValidLicense;
private double seguro;
final double BasePremium = 600;
	// To DO make logical process of car Insurance
	
	
	
	
	
	//constructor
	
	public void setCustomerAge(int customerAge) {
		customerage = customerAge;
	}
	
	public CarInsurance(int customerAge, String customerGender, String civilStatus, boolean isValidLicense) {
		super();
		customerage = customerAge;
		customerGender = customerGender;
		civilStatus = civilStatus;
		this.isValidLicense = isValidLicense;
		
	}

	public CarInsurance() {
		// TODO Auto-generated constructor stub
	}

	public double getSeguro() {
		return seguro;
	}
	
	

	public void setSeguro(int seguro) {
		this.seguro = seguro;
	}

	public void setCustomerGender(String customerGender) {
		customerGender = customerGender;
	}
	public void setCivilStatus(String civilStatus) {
		civilStatus = civilStatus;
	}
	public void setValidLicense(boolean isValidLicense) {
		this.isValidLicense = isValidLicense;
	}
	public int getCustomerAge() {
		return customerage;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public String getCivilStatus() {
		return civilStatus;
	}
	
	public boolean isValidLicense() {
		return isValidLicense;
	}
	
	public double CalcularSeguro() {	
		
		//DETERMINATED THE CAR INSURANCE VALUE
		
		if(customerGender.equals("M")&&civilStatus.equals("2")&&customerage<25 && isValidLicense) {
			seguro = 1500 + BasePremium;
		}
		else if((civilStatus.equals("1")||customerGender.equals("F") )&& isValidLicense){
			seguro = BasePremium-200;
		}
		
		else if(customerage>=45&&customerage<65 && isValidLicense) {
			seguro = BasePremium-100;
		}else {
			seguro=-1;
		}
	
	
	
	return seguro;
}
	
	
	
}
