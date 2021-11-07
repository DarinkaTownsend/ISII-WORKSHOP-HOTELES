package ec.edu.espol.workshops;

import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import io.cucumber.java.en.When; 

import static org.junit.Assert.*; public class StepsDefs { 

private String age; 

private String actualAnswer; 

 

@Given("80") public void InsuranceCar() { 

age = "80"; 

} 

 

@Given("age is {String}") 

public void Age_is(String age) { this.age = age; 

} 

 

@When("I ask if the user applies for car insurance") public void i_ask_applies_car_insurance() { 

actualAnswer = "less than 80 years old"; 

} 

 

@Then("The age should be {string}") 

public void the_age_should_be(String expectedAnswer) { assertEquals(expectedAnswer, actualAnswer); 

} 

} 