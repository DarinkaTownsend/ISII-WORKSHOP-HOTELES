package ec.edu.espol.workshops;
 
public class CarInsurance {
	private int CustomerAge;
	private String CustomerGender;
	private String CivilStatus;
	
	private boolean isValidLicense;
	private double seguro;
	// To DO make logical process of car Insurance
	
	
	//constructor
	
	public void setCustomerAge(int customerAge) {
		CustomerAge = customerAge;
	}
	
	public CarInsurance(int customerAge, String customerGender, String civilStatus, boolean isValidLicense,
			double seguro) {
		super();
		CustomerAge = customerAge;
		CustomerGender = customerGender;
		CivilStatus = civilStatus;
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
		CustomerGender = customerGender;
	}
	public void setCivilStatus(String civilStatus) {
		CivilStatus = civilStatus;
	}
	public void setValidLicense(boolean isValidLicense) {
		this.isValidLicense = isValidLicense;
	}
	public int getCustomerAge() {
		return CustomerAge;
	}
	public String getCustomerGender() {
		return CustomerGender;
	}
	public String getCivilStatus() {
		return CivilStatus;
	}
	
	public boolean isValidLicense() {
		return isValidLicense;
	}
	
	
	
}
