package insuracy;
/*
 * This is our Insurance class.
 * This is a base class that will be extended in HouseHold,TrafficInsurance and HealthInsurance classes.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */
import java.util.Random;

public class Insurance {
	public double calculatePolicyCharge(InsuredValue insuredValue) {// method that calculates policy charge of the given insuredValue.
		return 0;// it will be overridden in  HouseHold,TrafficInsurance and HealthInsurance classes.
	}
	
	public int generateFixedFee() {// method that generates fixed fee.
		java.util.Random rand = new Random();
		int fixedFee = rand.nextInt(2001)+1000;
		return fixedFee;
	}
}
