package ec.edu.espol.workshops;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		System.out.println ("?WELCOME TO YOU CAR-INSURANCE!");
		System.out.println ("------------------------------------------");
		
		
		int CustomerAge;
		String CustomerGender;
		String CivilStatus;		
		boolean isValidLicense;
		double Seguro;
		final double BasePremium = 500;
		Scanner entradaEscaner = new Scanner (System.in);
       
		//AGE
		System.out.println ("Please enter your age: ");
		CustomerAge = entradaEscaner.nextInt(); 
	
		while(CustomerAge<=0) {
			System.out.println ("Please enter a real age: ");
			CustomerAge = entradaEscaner.nextInt();
		}
		
		if(CustomerAge>=80) {
			System.out.println ("Sorry you are not allowed to have a car insurance");
			Seguro=-1;
		}else {
			
			// GENDER
			Scanner entradaEscaner2 = new Scanner (System.in);
			System.out.println ("Please enter your gender (F/M): ");
			CustomerGender = entradaEscaner2.nextLine().strip().replace("\n", "");
			while(!CustomerGender.equals("F") && !CustomerGender.equals("M")) {
				System.out.println ("Please enter your gender in the correct form (F/M): ");
				CustomerGender = entradaEscaner2.nextLine().strip().replace("\n", "");
			}
			
			// CIVIL STATUS
			
			System.out.println ("Please enter de number of your civil status:");
			System.out.println ("1. Married");
			System.out.println ("2. Not married\n");
			Scanner entradaEscaner3 = new Scanner (System.in);
			CivilStatus = entradaEscaner3.nextLine();
			
			while(!CivilStatus.equals("1") && !CivilStatus.equals("2")) {
				System.out.println ("Please enter de NUMBER of your civil status:");
				System.out.println ("1. Married");
				System.out.println ("2. Not married\n");
				CivilStatus = entradaEscaner3.nextLine();
			}
			
			// LICENSE
			System.out.println ("?Your license is valid? (Y/N):");
			String condi;
			Scanner entradaEscaner4 = new Scanner (System.in);
			condi = entradaEscaner4.nextLine();
			
			while(!condi.equals("Y") && !condi.equals("N")){
				System.out.println ("Please enter (Y/N) ?Your license is valid?:");
				condi = entradaEscaner4.nextLine();
			}
			
			if(condi.equals("Y")) {
				isValidLicense=true;
			}else {
				isValidLicense=false;
			}
			
			//DETERMINATED THE CAR INSURANCE VALUE
			
			if(CustomerGender.equals("M")&&CivilStatus.equals("2")&&CustomerAge<25) {
				Seguro = 1500 + BasePremium;
			}
			else if(CustomerGender.equals("F")||CivilStatus.equals("1")){
				Seguro = BasePremium-200;
			}
			else if(CustomerAge>=45&&CustomerAge<65) {
				Seguro = BasePremium-100;
			}else {
				Seguro=-1;
			}
			
			CarInsurance insu = new CarInsurance(CustomerAge, CustomerGender, CivilStatus, isValidLicense,Seguro);
			
			if(insu.getSeguro()==-1) {
				System.out.println("Sorry but you are not available to have a car insurance");
				System.out.print("Your car insurance is: "+ insu.getSeguro());
				
			}else {
				System.out.println("?Congratulations!");
				System.out.println("You are available to have a car insurance of $" + insu.getSeguro());
			}
			
		}
		
		
		
		
		
		

	}

}
