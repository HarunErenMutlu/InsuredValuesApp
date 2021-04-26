package insuracy;
/*
 * This is our Automobile class with its getter.
 * This is a derived class of Vehicle.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */
public class Automobile extends Vehicle{
	private String typeOfRoof;
	Automobile(String insuranceName, int yearOfInsurance,String plateCity, float engineVolume, int yearOfProduction,//Constructor method
			String typeOfGear, int fuelTankVolume,String typeOfRoof){
		super( insuranceName, yearOfInsurance,plateCity, engineVolume, yearOfProduction,typeOfGear,fuelTankVolume);// it is a call to Vehicle.
		this.typeOfRoof = typeOfRoof;
		
	}
	public String getTypeOfRoof() {
		return typeOfRoof;
	}
	
	public double calculateRiskFactor() {// method that calculate riskFactor and return it. It overrides calculateRiskFactor.
		int age = 2020- this.getYearOfProduction();
		double plateNumber = 0.65;// If it's another plate city.
		double roofNumber = 0.48;//If it's type of roof is Moon roof.
		
		if(this.getPlateCity().equalsIgnoreCase("Izmir")) {
			plateNumber = 0.78;
		}
		else if (this.getPlateCity().equalsIgnoreCase("Istanbul")) {
			plateNumber = 0.97;
		}
		else if (this.getPlateCity().equalsIgnoreCase("Ankara")) {
			plateNumber = 0.85;
		}
		
		if(this.getTypeOfRoof().equalsIgnoreCase("Regular")) {
			roofNumber = 0.1;
		}
		else if (this.getTypeOfRoof().equalsIgnoreCase("Sunroof")) {
			roofNumber = 0.64;
		}
		double riskFactor = (this.getEngineVolume()*(0.004*this.getFuelTankVolume())*age*(plateNumber*0.03))/roofNumber;
		return riskFactor;
	}
}

