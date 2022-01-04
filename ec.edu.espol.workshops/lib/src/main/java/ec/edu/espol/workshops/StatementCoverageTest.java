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
	
	// TEST TC1
	
		@test
		public void testTC1() {
			CarInsurance seguro= new CarInsurance();
			seguro.setCustomerAge(19);
			seguro.setValidLicense(false);
			
			double resultante= seguro.CalcularSeguro();
			assertEquals(-1, resultante);
			
		}
}
