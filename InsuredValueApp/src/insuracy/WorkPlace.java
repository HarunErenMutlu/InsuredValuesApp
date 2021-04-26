package insuracy;
/*
 * This is our WorkPlace class with its getter.
 * This is a derived class of Premises.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */
public class WorkPlace extends Premises {
	private int AnnualRevenue;
	WorkPlace(String insuranceName, int yearOfInsurance,String premisesCity, int numberOfFloors, int yearOfConstruction,//Constructor method
			String typeOfConstruction, int surfaceArea,int AnnualRevenue){
		super(insuranceName,yearOfInsurance,premisesCity,numberOfFloors,yearOfConstruction,typeOfConstruction,surfaceArea);// it is a call to Premises
		this.AnnualRevenue= AnnualRevenue;
		
		
	}
	public int getAnnualRevenue() {
		return AnnualRevenue;
	}
	
	public double calculateRiskFactor() {// method that calculate riskFactor and return it. It overrides calculateRiskFactor.
		
		double premiseNumber = 0.25;// If it is another premise city
		double constructionNumber = 0.92;//If it is another type of construction
		double floorNumber = 0.85;//If it's number of floors is more than 18.
		double yearNumber = 0.1;// If it's year of construction is greater than 1999.
		
		if(this.getPremisesCity().equals("Izmir")) {
			premiseNumber = 0.4;
		}
		else if (this.getPremisesCity().equals("Istanbul")) {
			premiseNumber = 0.6;
		}
		else if (this.getPremisesCity().equals("Ankara")) {
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
		double riskFactor= (premiseNumber*floorNumber*yearNumber*constructionNumber)*(this.getSurfaceArea()*0.2)*(0.003*this.getAnnualRevenue());
		return riskFactor;
	}
}
