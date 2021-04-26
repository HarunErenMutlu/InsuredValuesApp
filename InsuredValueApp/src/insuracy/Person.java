package insuracy;
/*
 * This is our Person class with its getters and setters.
 * This is a derived class of InsuredValue.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */

public class Person extends InsuredValue{
	private String residenceCity, name, gender, typeOfChronicleIlness;
	private int yearOfBirth;
	private long nationalId;
	Person(String insuranceName, int yearOfInsurance,String residenceCity, String name, long nationalId,// Constructor method
			String gender, int yearOfBirth,String typeOfChronicleIllness){
		super(insuranceName,yearOfInsurance);// it is a call to InsuredValue.
		this.residenceCity = residenceCity;
		this.name= name;
		this.nationalId = nationalId;
		this.gender = gender;
		this.yearOfBirth = yearOfBirth;
		this.typeOfChronicleIlness = typeOfChronicleIllness;
		
		
	}
	public String getResidenceCity() {
		return residenceCity;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getTypeOfChronicleIlness() {
		return typeOfChronicleIlness;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public long getNationalId() {
		return nationalId;
	}
	
	public double calculateRiskFactor(){// method that calculate riskFactor and return it. It overrides calculateRiskFactor.
		int age = 2020- this.getYearOfBirth();
		double ilnessNumber = 1.8;// if it is another chronical illness.
		if(this.getTypeOfChronicleIlness().equalsIgnoreCase("Cardiovascular")) {
			ilnessNumber = 1.85;
		}
		else if(this.getTypeOfChronicleIlness().equalsIgnoreCase("Diabetes")) {
			ilnessNumber = 1.84;
		}
		else if(this.getTypeOfChronicleIlness().equalsIgnoreCase("Respiratory")) {
			ilnessNumber = 1.86;
		}
		else if (this.getTypeOfChronicleIlness().equalsIgnoreCase("None")) {
			ilnessNumber = 0.1;
		}
		
		double riskFactor = (age*age)/(ilnessNumber*18);
		return riskFactor;
	}
}





