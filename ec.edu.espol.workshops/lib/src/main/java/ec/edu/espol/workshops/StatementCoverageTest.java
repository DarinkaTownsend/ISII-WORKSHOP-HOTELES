package ec.edu.espol.workshops;

import static org.junit.Assert.assertEquals;


public class StatementCoverageTest {
	
	
	// TEST TC1
	
	@test
	public void testTC1() {
		CarInsurance seguro= new CarInsurance();
		seguro.setCustomerAge(19);
		seguro.setValidLicense(false);
		
		double resultante= seguro.CalcularSeguro();
		assertEquals(-1, resultante);
		
	}
	
	// TEST TC2
	
		@test
		public void testTC2() {
			CarInsurance seguro= new CarInsurance();
			seguro.setCustomerAge(30);
			seguro.setValidLicense(true);
			seguro.setCustomerGender("M");
			seguro.setCivilStatus("2");
			
			double resultante= seguro.CalcularSeguro();
			assertEquals(-1, resultante);
			
		}
		
		// TEST TC3
		
			@test
			public void testTC3() {
				CarInsurance seguro= new CarInsurance();
				seguro.setCustomerAge(20);
				seguro.setValidLicense(true);
				seguro.setCustomerGender("M");
				seguro.setCivilStatus("2");
				
				double resultante= seguro.CalcularSeguro();
				assertEquals(2100, resultante);
				
			}
			
			// TEST TC4
			
			@test
			public void testTC4() {
				CarInsurance seguro= new CarInsurance();
				seguro.setCustomerAge(30);
				seguro.setValidLicense(true);
				seguro.setCustomerGender("F");
				seguro.setCivilStatus("1");
				
				double resultante= seguro.CalcularSeguro();
				assertEquals(400, resultante);
				
			}
			
			// TEST TC5
			
			@test
			public void testTC5() {
				CarInsurance seguro= new CarInsurance();
				seguro.setCustomerAge(30);
				seguro.setValidLicense(true);
				seguro.setCustomerGender("M");
				seguro.setCivilStatus("2");
				
				double resultante= seguro.CalcularSeguro();
				assertEquals(500, resultante);
				
			}
}
