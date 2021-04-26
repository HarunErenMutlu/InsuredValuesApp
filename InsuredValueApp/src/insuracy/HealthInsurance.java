package insuracy;
/*
 * This is our HealthInsurance class.
 * This is a derived class of Insurance.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */
public class HealthInsurance extends Insurance {
	
	public double calculatePolicyCharge(InsuredValue insuredValue) {//method that calculates policy charge. It overrides calculatePolicyCharge function.
		int rankOfInsurance = 2020 - insuredValue.getYearOfInsurance();
		double riskFactor = insuredValue.calculateRiskFactor();
		double policyCharge = (this.generateFixedFee()*(Math.pow(riskFactor, 3)))/208;
		if(rankOfInsurance<3 && riskFactor>50) {
			policyCharge = 1000000000 ;
		}
		return policyCharge;
	}
}
