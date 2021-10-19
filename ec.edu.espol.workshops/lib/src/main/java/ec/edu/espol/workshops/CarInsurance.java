package ec.edu.espol.workshops;
 
public class CarInsurance {
	private int CustomerAge;
	private char CustomerGender;
	private String CivilStatus;
	private static final double BasePremium = 500;
	private boolean isValidLicense;
	// To DO make logical process of car Insurance
	public void setCustomerAge(int customerAge) {
		CustomerAge = customerAge;
	}
	public void setCustomerGender(char customerGender) {
		CustomerGender = customerGender;
	}
	public void setCivilStatus(String civilStatus) {
		CivilStatus = civilStatus;
	}
	public void setValidLicense(boolean isValidLicense) {
		this.isValidLicense = isValidLicense;
	}
	
}
