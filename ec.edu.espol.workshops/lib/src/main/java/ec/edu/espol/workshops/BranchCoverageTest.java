package ec.edu.espol.workshops;

import static org.junit.Assert.assertEquals;

public class BranchCoverageTest {
	
CarInsurance seguro = new CarInsurance();
	
	
	
	//TEST TC7
	@test
	public void testTC7() {
	 seguro.setCustomerAge(-1);;
	 seguro.setCustomerGender("F");
	 seguro.setCivilStatus("1");
	 seguro.setValidLicense(true);
	
	 double valorSeguro = seguro.CalcularSeguro();
	 assertEqueals(-1,valorSeguro);
	}
	
	//TEST TC8
	@test
	public void testTC8() {
	 seguro.setCustomerAge(17);
	 seguro.setCustomerGender("M");
	 seguro.setCivilStatus("1");
	 seguro.setValidLicense(true);
	
	 double valorSeguro = seguro.CalcularSeguro();
	 assertEqueals(-1,valorSeguro);
	}
	
	//TEST TC9
	@test
	public void testTC9() {
	 seguro.setCustomerAge(19);
	 seguro.setCustomerGender("S");
	 seguro.setCivilStatus(1);
	 seguro.setValidLicense("Y");
	
	 double valorSeguro = seguro.CalcularSeguro();

	 assertEqueals(-1,valorSeguro);
	}
	
	//TEST TC10
	@test
	public void testTC10() {
	 seguro.setCustomerAge(19);
	 seguro.setCustomerGender("F");
	 seguro.setCivilStatus("3");
	 seguro.setValidLicense(true);
	
	 double valorSeguro = seguro.CalcularSeguro();

	 assertEqueals(-1,valorSeguro);
	}
	
	
	
	//TEST TC12
	@test
	public void testTC12() {
	 seguro.setCustomerAge(22);
	 seguro.setCustomerGender("F");
	 seguro.setCivilStatus("1");
	 seguro.setValidLicense(true);
	
	 double valorSeguro = seguro.CalcularSeguro();

	 assertEqueals(400,valorSeguro);
	}
	
	//TEST TC13
	@test
	public void testTC13() {
	 seguro.setCustomerAge(50);
	 seguro.setCustomerGender("M");
	 seguro.setCivilStatus("2");
	 seguro.setValidLicense(true);

	 double valorSeguro = seguro.CalcularSeguro();

	 assertEqueals(500,valorSeguro);
	}
	
	//TEST TC14
	@test
	public void testTC14() {
	 seguro.setCustomerAge(20);
	 seguro.setCustomerGender("M");
	 seguro.setCivilStatus("2");
	 seguro.setValidLicense(true);
	
	 double valorSeguro = seguro.CalcularSeguro();

	 assertEqueals(2100,valorSeguro);
	}
	
	//TEST TC15
	@test
	public void testTC15() {
	 seguro.setCustomerAge(25);
	 seguro.setCustomerGender("M");
	 seguro.setCivilStatus("2");
	 seguro.setValidLicense(true);

	 double valorSeguro = seguro.CalcularSeguro();

	 assertEqueals(-1,valorSeguro);
	}
	
	//TEST TC16
	@test
	public void testTC16() {
	 seguro.setCustomerAge(24);
	 seguro.setCustomerGender("M");
	 seguro.setCivilStatus("2");
	 seguro.setValidLicense(false);
	 
	 double valorSeguro = seguro.CalcularSeguro();

	 assertEqueals(-1,valorSeguro);
	}
	


}
