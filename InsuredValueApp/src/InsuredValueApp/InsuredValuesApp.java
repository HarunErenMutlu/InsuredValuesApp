package InsuredValueApp;

/*
 * This class InsuredValuesApp where includes all the prints for our homework.
 * This class calls policyRecord class for functions that does the missions.
 * And also calls Initialization class to get data that classified in it.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */


import java.math.BigDecimal;
import java.util.Scanner;

import insuracy.HealthInsurance;
import insuracy.HouseHold;
import insuracy.Initialization;
import insuracy.Insurance;
import insuracy.PolicyRecord;
import insuracy.TrafficInsurance;

public class InsuredValuesApp {
	private Initialization initial;
	private PolicyRecord policyRecords;
	public InsuredValuesApp() {// It is the constructor method.
		initial = new Initialization();
		policyRecords = initial.getPolicyRecord();
	}
	public void run() {// The method that prints the entered choices.
		Scanner scanner = new Scanner(System.in);
		String input= "";
		while(!input.equalsIgnoreCase("e")) {
			System.out.println("1 All insured values, 2 Workplaces, 3 Housings, 4 People, 5 Automobiles, 6 Trucks., e Exit");
			System.out.println("Please enter your choice:");
			input = scanner.next();
			if(input.equals("1")) {
				this.getAll();
			}
			else if(input.equals("2")) {
				this.getWorkPlaces();
			}
			else if(input.equals("3")) {
				this.getHousings();
			}
			else if (input.equals("4")) {
				this.getPeople();
			}
			else if (input.equals("5")) {
				this.getAutomobiles();
			}
			else if (input.equals("6")) {
				this.getTrucks();
			}
			else if(input.equalsIgnoreCase("e")){
				System.out.println("Good Bye!");
			}
			else{
				System.out.println("Invalid Option");
				System.out.println("Please try again ");
			}
		}
		scanner.close();
	}
	
	public void getAll() {// The method that calls all the written functions below. 
		this.getWorkPlaces();
		this.getHousings();
		this.getPeople();
		this.getAutomobiles();
		this.getTrucks();
	}
	
	public void getWorkPlaces() {// The method that prints all WorkPlaces and its features.
		Insurance insurance = new HouseHold();
		int index = 0;
		while(index<policyRecords.getWorkPlaceList().size()) {
			double policyCharge = insurance.calculatePolicyCharge(policyRecords.getWorkPlaceList().get(index));
			String strPolicyCharge;
			strPolicyCharge = String.format("%.5f", BigDecimal.valueOf(policyCharge));// to be able to control how many decimal will be written.
			String insuranceNumber = policyRecords.getWorkPlaceList().get(index).getInsuranceNumber();
			System.out.print("Insured Value: WorkPlace Insurance Number: "+insuranceNumber);
			System.out.println(" Year of Insurance: "+policyRecords.getWorkPlaceList().get(index++).getYearOfInsurance());
			System.out.print("The policy charge of "+insuranceNumber);
			System.out.println(": "+ strPolicyCharge+" TL");
		}
	}
	
	public void getHousings() {// The method that prints all Housings and its features.
		Insurance insurance = new HouseHold();
		int index = 0;
		while(index<policyRecords.getHousingList().size()) {
			double policyCharge = insurance.calculatePolicyCharge(policyRecords.getHousingList().get(index));
			String strPolicyCharge;
			strPolicyCharge = String.format("%.5f", BigDecimal.valueOf(policyCharge));// to be able to control how many decimal will be written.
			String insuranceNumber = policyRecords.getHousingList().get(index).getInsuranceNumber();
			System.out.print("Insured Value: Housing Insurance Number: "+insuranceNumber);
			System.out.println(" Year of Insurance: "+policyRecords.getHousingList().get(index++).getYearOfInsurance());
			System.out.print("The policy charge of "+insuranceNumber);
			System.out.println(": "+strPolicyCharge+" TL");
	}
	}
	
	public void getPeople() {// The method that prints all People and its features.
		int index = 0;
		Insurance health = new HealthInsurance();
		while(index< policyRecords.getPersonList().size()) {
			double policyCharge = health.calculatePolicyCharge(policyRecords.getPersonList().get(index));
			String strPolicyCharge;
			if(policyCharge== 1000000000) {// if it is  1000000000 there is no need to write after dot.
				strPolicyCharge = String.format("%.0f", BigDecimal.valueOf(policyCharge));
			}
			else {
				strPolicyCharge = String.format("%.5f", BigDecimal.valueOf(policyCharge));// to be able to control how many decimal will be written.
			}
			String insuranceNumber = policyRecords.getPersonList().get(index).getInsuranceNumber();
			System.out.print("Insured Value: Person Insurance Number: "+insuranceNumber);
			System.out.println(" Year of Insurance: "+policyRecords.getPersonList().get(index++).getYearOfInsurance());
			System.out.print("The policy charge of "+insuranceNumber);
			System.out.println(": "+strPolicyCharge+" TL");
		}
	}
	
	public void getAutomobiles() {// The method that prints all Automobiles and its features.
		int index = 0;
		Insurance automobile = new TrafficInsurance();
		while(index<policyRecords.getAutomobileList().size()) {
			double policyCharge = automobile.calculatePolicyCharge(policyRecords.getAutomobileList().get(index));
			String strPolicyCharge;
			strPolicyCharge = String.format("%.5f", BigDecimal.valueOf(policyCharge));// to be able to control how many decimal will be written.
			String insuranceNumber = policyRecords.getAutomobileList().get(index).getInsuranceNumber();
			System.out.print("Insured Value: Automobile Insurance Number: "+insuranceNumber);
			System.out.println(" Year of Insurance: "+policyRecords.getAutomobileList().get(index++).getYearOfInsurance());
			System.out.print("The policy charge of "+insuranceNumber);
			System.out.println(": "+ strPolicyCharge+" TL");
		}
	}
	
	public void getTrucks() {// The method that prints all Trucks and its features.
		int index = 0;
		Insurance truck = new TrafficInsurance();
		while(index<policyRecords.getTruckList().size()) {
			double policyCharge = truck.calculatePolicyCharge(policyRecords.getTruckList().get(index));
			String strPolicyCharge;
			strPolicyCharge = String.format("%.5f", BigDecimal.valueOf(policyCharge));// to be able to control how many decimal will be written.
			String insuranceNumber = policyRecords.getTruckList().get(index).getInsuranceNumber();
			System.out.print("Insured Value: Truck Insurance Number: "+insuranceNumber);
			System.out.println(" Year of Insurance: "+policyRecords.getTruckList().get(index++).getYearOfInsurance());
			System.out.print("The policy charge of "+insuranceNumber);
			System.out.println(": "+ strPolicyCharge+" TL");
		}
	}
	
}
