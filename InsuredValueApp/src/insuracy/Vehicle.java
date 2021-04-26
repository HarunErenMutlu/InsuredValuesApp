package insuracy;
/*
 * This is our Vehicle class with its getters and setters.
 * This is a derived class of InsuredValue.
 * And also it is a base class for Automobile and Truck classes.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */
public class Vehicle extends InsuredValue {
	private String plateCity,typeOfGear;
	private float engineVolume;
	private int yearOfProduction,fuelTankVolume;
	
	Vehicle(String insuranceName, int yearOfInsurance,String plateCity, float engineVolume, int yearOfProduction,// Constructor method
			String typeOfGear, int fuelTankVolume){
		super(insuranceName,yearOfInsurance);// It is a call to InsuredValue.
		this.plateCity = plateCity;
		this.engineVolume = engineVolume;
		this.yearOfProduction = yearOfProduction;
		this.typeOfGear = typeOfGear;
		this.fuelTankVolume = fuelTankVolume;
		
		
	}
	public String getPlateCity() {
		return plateCity;
	}
	public String getTypeOfGear() {
		return typeOfGear;
	}
	public float getEngineVolume() {
		return engineVolume;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public int getFuelTankVolume() {
		return fuelTankVolume;
	}
	
	public double calculateRiskFactor(){// method that calculate riskFactor and return it. It overrides calculateRiskFactor.
		return 0;// And it will be overridden in Truck and Automobile classes.
	}
	
}
