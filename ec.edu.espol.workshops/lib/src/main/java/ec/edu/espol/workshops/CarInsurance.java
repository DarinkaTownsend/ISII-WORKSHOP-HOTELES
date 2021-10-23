package ec.edu.espol.workshops;
 
public class CarInsurance {
private int customerage;
private String customerGender;
private String civilStatus;
	
	private boolean isValidLicense;
	private double seguro;
	// To DO make logical process of car Insurance
	
	
	//constructor
	
	public void setCustomerAge(int customerAge) {
		customerage = customerAge;
	}
	
	public CarInsurance(int customerAge, String customerGender, String civilStatus, boolean isValidLicense,
			double seguro) {
		super();
		customerage = customerAge;
		customerGender = customerGender;
		civilStatus = civilStatus;
		this.isValidLicense = isValidLicense;
		this.seguro = seguro;
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
	
	
	
}
