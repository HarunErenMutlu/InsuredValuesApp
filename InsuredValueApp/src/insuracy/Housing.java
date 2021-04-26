package insuracy;

/*
 * This is our Housing class with its getter.
 * This is a derived class of Premises.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */
public class Housing extends Premises{
	private String residentSituation;
	Housing(String insuranceName, int yearOfInsurance,String premisesCity, int numberOfFloors, int yearOfConstruction,//Constructor method
			String typeOfConstruction, int surfaceArea, String residentSituation){
		super(insuranceName,yearOfInsurance,premisesCity,numberOfFloors,yearOfConstruction,typeOfConstruction,surfaceArea);// it is a call to Premises.
		this.residentSituation = residentSituation;
		
		
	}
	public String getResidentSituation() {
		return residentSituation;
	}
	
	public double calculateRiskFactor() {// method that calculate riskFactor and return it. It overrides calculateRiskFactor.
		double premiseNumber = 0.25;// If it is another premise city.
		double constructionNumber = 0.92;//If it is another type of construction
		double situationOfResident = 0.42;// If it's situation is Landlord.
		double floorNumber = 0.85;//If it's number of floors is more than 18.
		double yearNumber = 0.1;// If it's year of construction is greater than 1999.
		
		if(this.getPremisesCity().equalsIgnoreCase("Izmir")) {
			premiseNumber = 0.4;
		}
		else if (this.getPremisesCity().equalsIgnoreCase("Istanbul")) {
			premiseNumber = 0.6;
		}
		else if (this.getPremisesCity().equalsIgnoreCase("Ankara")) {
			premiseNumber = 0.15;
		}
		
		
		if(this.getTypeOfConstruction().equalsIgnoreCase("Steel")) {
			constructionNumber = 0.1;
		}
		else if (this.getTypeOfConstruction().equalsIgnoreCase("Concrete")) {
			constructionNumber = 0.37;
		}
		else if (this.getTypeOfConstruction().equalsIgnoreCase("Wood")) {
			constructionNumber = 0.58;
		}
		
		if(this.getResidentSituation().equalsIgnoreCase("Tenant")) {
			situationOfResident = 0.18;
		}
		
		if(this.getNumberOfFloors()<=3) {
			floorNumber = 0.1;
		}
		else if(this.getNumberOfFloors()<=7) {
			floorNumber= 0.25;
		}
		else if(this.getNumberOfFloors()<=18) {
			floorNumber= 0.5;
		}
		
		if(this.getYearOfConstruction()<1975) {
			yearNumber = 0.58;
		}
		else if (this.getYearOfConstruction()<1999) {
			yearNumber = 0.32;
		}
		
		double riskFactor = ((premiseNumber*floorNumber*yearNumber*constructionNumber)*
				this.getSurfaceArea())/situationOfResident;
		return riskFactor;
	}
}
