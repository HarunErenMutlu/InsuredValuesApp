package insuracy;
/*
 * This is our Premises class with its getters and setters.
 * This is a derived class of InsuredValue.
 * And also it is a base class for Housing and WorkPlace classes.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */
public class Premises extends InsuredValue{
	private int numberOfFloors, yearOfConstruction,surfaceArea;
	private String premisesCity,typeOfConstruction;
	Premises(String insuranceName, int yearOfInsurance,String premisesCity, int numberOfFloors, int yearOfConstruction,// Constructor method
			String typeOfConstruction, int surfaceArea){
		super(insuranceName,yearOfInsurance);// it is a call to InsuredValue.
		this.premisesCity = premisesCity;
		this.numberOfFloors = numberOfFloors;
		this.yearOfConstruction= yearOfConstruction;
		this.typeOfConstruction = typeOfConstruction;
		this.surfaceArea = surfaceArea;
		
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public int getYearOfConstruction() {
		return yearOfConstruction;
	}
	public int getSurfaceArea() {
		return surfaceArea;
	}
	public String getPremisesCity() {
		return premisesCity;
	}
	public String getTypeOfConstruction() {
		return typeOfConstruction;
	}
	
	public double calculateRiskFactor(){// method that calculate riskFactor and return it. It overrides calculateRiskFactor
		return 0;// And it will be overridden in Housing and WorkPlace classes.
	}
}
