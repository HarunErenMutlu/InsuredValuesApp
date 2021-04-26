package insuracy;
/*
 * This class Initialization calls FileIO class to get data in it.
 * It converts the data to PolicyRecord class and returns them.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */

import FileAccess.FileIO;

public class Initialization {
	private FileIO file;
	String[][] values;
	private PolicyRecord policyRecord;
	
	public Initialization(){// Constructor class
		file = new FileIO();
		policyRecord = new PolicyRecord();
		this.getData();
	}
	
	public void getData() {// the method that classificates and converts data as policyRecord class.
		values = file.getInsuredValues();// all data from FileIO
		
		for(int i = 0;i<values.length;i++) {
			if(values[i][0].contains("W")) {// if the first data contains W, it means data belong to WorkPlaceclass.
				
				InsuredValue workPlace = new WorkPlace(values[i][0],
						Integer.valueOf(values[i][1]),
						values[i][2],
						Integer.valueOf(values[i][3]),
						Integer.valueOf(values[i][4]),
						values[i][5],
						Integer.valueOf(values[i][6]),
						Integer.valueOf(values[i][7]));
				policyRecord.setInsuredValueList(workPlace);
			}
			
			if(values[i][0].contains("P")) {// if the first data contains P, it means data belong to Person class.
				
				InsuredValue person = new Person(values[i][0],
						Integer.valueOf(values[i][1]),
						values[i][2],
						values[i][3],
						Long.valueOf(values[i][4]),
						values[i][5],
						Integer.valueOf(values[i][6]),
						values[i][7]);
				policyRecord.setInsuredValueList(person);
			}
			
			if(values[i][0].contains("H")) {// if the first data contains H, it means data belong to Housing class.
				
				InsuredValue housing = new Housing(values[i][0],
						Integer.valueOf(values[i][1]),
						values[i][2],
						Integer.valueOf(values[i][3]),
						Integer.valueOf(values[i][4]),
						values[i][5],
						Integer.valueOf(values[i][6]),
						values[i][7]);
				policyRecord.setInsuredValueList(housing);
			}
			
			if(values[i][0].contains("A")) {// if the first data contains A, it means data belong to Automobile class.
				
				InsuredValue automobile = new Automobile(values[i][0],
						Integer.valueOf(values[i][1]),
						values[i][2],
						Float.valueOf(values[i][3]),
						Integer.valueOf(values[i][4]),
						values[i][5],
						Integer.valueOf(values[i][6]),
						values[i][7]);
				policyRecord.setInsuredValueList(automobile);
			}
			
			if(values[i][0].contains("T")) {// if the first data contains T, it means data belong to Truck class.
				
				InsuredValue truck = new Truck(values[i][0],
						Integer.valueOf(values[i][1]),
						values[i][2],
						Float.valueOf(values[i][3]),
						Integer.valueOf(values[i][4]),
						values[i][5],
						Integer.valueOf(values[i][6]),
						values[i][7]);
				policyRecord.setInsuredValueList(truck);
			}
		}
	}

	public PolicyRecord getPolicyRecord() {// the method that returns policyRecord.
		return policyRecord;
	}
	
	
}








