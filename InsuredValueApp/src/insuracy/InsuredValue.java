package insuracy;
/*
 * This is our InsuredValue class with its getters and setters.
 * This is a base class that will be extended in Premises,Person and Vehicle classes.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */


public class InsuredValue {
	private String insuranceNumber;
	private int yearOfInsurance;
	
	InsuredValue(String insuranceNumber, int yearOfInsurance){// Constructor class
		this.insuranceNumber = insuranceNumber;
		this.yearOfInsurance = yearOfInsurance;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public int getYearOfInsurance() {
		return yearOfInsurance;
	}
	public void setYearOfInsurance(int yearOfInsurance) {
		this.yearOfInsurance = yearOfInsurance;
	}
	
	public double calculateRiskFactor() {// It calculates risk factor of InsuredValue. It will be overridden.
		return 0;
	}
}
