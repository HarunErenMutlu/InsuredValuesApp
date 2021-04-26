package insuracy;
/*
 * This is our Truck class with its getter.
 * This is a derived class of Vehicle.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */
public class Truck extends Vehicle {
	private String typeOfTruckBed;
	Truck(String insuranceName, int yearOfInsurance,String plateCity, float engineVolume, int yearOfProduction,//Constructor method
			String typeOfGear, int fuelTankVolume,String typeOfTruckBed){
		super( insuranceName, yearOfInsurance,plateCity, engineVolume, yearOfProduction,typeOfGear,fuelTankVolume);// it is a call to Vehicle.
		
		this.typeOfTruckBed = typeOfTruckBed;
		
		
	}
	public String getTypeOfTruckBed() {
		return typeOfTruckBed;
	}
	
	public double calculateRiskFactor() {// method that calculate riskFactor and return it. It overrides calculateRiskFactor.
		int age = 2020- this.getYearOfProduction();
		double plateNumber = 0.65;// If it's another plate city.
		double bedNumber = 0.15;//If it's type of truck bed is Regular.
		
		if(this.getPlateCity().equalsIgnoreCase("Izmir")) {
			plateNumber = 0.78;
		}
		else if (this.getPlateCity().equalsIgnoreCase("Istanbul")) {
			plateNumber = 0.97;
		}
		else if (this.getPlateCity().equalsIgnoreCase("Ankara")) {
			plateNumber = 0.85;
		}
		
		if(this.getTypeOfTruckBed().equalsIgnoreCase("Trailer")) {
			bedNumber = 0.87;
		}
		else if(this.getTypeOfTruckBed().equalsIgnoreCase("Tanker")) {
			bedNumber= 0.84;
		}
		
		double riskFactor = (((Math.pow(age, 3))/(0.008*this.getFuelTankVolume()))*this.getEngineVolume()*(plateNumber*0.03))/(Math.pow(bedNumber,2));
		return riskFactor;
	}
}




