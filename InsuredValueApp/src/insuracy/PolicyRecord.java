package insuracy;

/*
 * This class PolicyRecord classificates, stores and returns ArrayList of InsuredValues.
 * This class calls InsuredValue to get functions and data to be able to classificate them.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */

import java.util.ArrayList;

public class PolicyRecord {
	private ArrayList<InsuredValue> insuredValueList = new ArrayList<InsuredValue>();

	public void setInsuredValueList(InsuredValue insuredValue) {// method that sets ArrayList.
		this.insuredValueList.add(insuredValue);
	}
	
	
	
	public ArrayList<InsuredValue> getInsuredValueList() {// method that returns ArrayList.
		return insuredValueList;
	}



	public ArrayList<InsuredValue> getWorkPlaceList(){// method that classificates and returns workPlaces.
		ArrayList<InsuredValue> listOfWorkPlaces = new ArrayList<InsuredValue>();
		for(int i =0;i<this.insuredValueList.size();i++) {
			if(insuredValueList.get(i).getInsuranceNumber().contains("W")) {
				listOfWorkPlaces.add(insuredValueList.get(i));
			}
		}
		return listOfWorkPlaces;
	}
	public ArrayList<InsuredValue> getHousingList(){// method that classificates and returns Housings.
		ArrayList<InsuredValue> listOfHousing = new ArrayList<InsuredValue>();
		for(int i =0;i<this.insuredValueList.size();i++) {
			if(insuredValueList.get(i).getInsuranceNumber().contains("H")) {
				listOfHousing.add(insuredValueList.get(i));
			}
		}
		return listOfHousing;
	}
	public ArrayList<InsuredValue> getPersonList(){// method that classificates and returns People.
		ArrayList<InsuredValue> listOfPerson = new ArrayList<InsuredValue>();
		for(int i =0;i<this.insuredValueList.size();i++) {
			if(insuredValueList.get(i).getInsuranceNumber().contains("P")) {
				listOfPerson.add(insuredValueList.get(i));
			}
		}
		return listOfPerson;
	}
	public ArrayList<InsuredValue> getAutomobileList(){// method that classificates and returns Automobiles.
		ArrayList<InsuredValue> listOfAutomobiles = new ArrayList<InsuredValue>();
		for(int i =0;i<this.insuredValueList.size();i++) {
			if(insuredValueList.get(i).getInsuranceNumber().contains("A")) {
				listOfAutomobiles.add(insuredValueList.get(i));
			}
		}
		return listOfAutomobiles;
	}
	public ArrayList<InsuredValue> getTruckList(){// method that classificates and returns Trucks.
		ArrayList<InsuredValue> listOfTrucks = new ArrayList<InsuredValue>();
		for(int i =0;i<this.insuredValueList.size();i++) {
			if(insuredValueList.get(i).getInsuranceNumber().contains("T")) {
				listOfTrucks.add(insuredValueList.get(i));
			}
		}
		return listOfTrucks;
	}
	
}
