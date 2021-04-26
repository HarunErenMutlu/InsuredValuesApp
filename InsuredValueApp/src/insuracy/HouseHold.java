package insuracy;
/*
 * This is our HouseHold class.
 * This is a derived class of Insurance.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */


public class HouseHold extends Insurance{
	public double calculatePolicyCharge(InsuredValue insuredValue) {//method that calculates policy charge. It overrides calculatePolicyCharge function.
		int rankOfInsurance = 2020 - insuredValue.getYearOfInsurance();
		double policyCharge = this.generateFixedFee()*(insuredValue.calculateRiskFactor()*insuredValue.calculateRiskFactor());
		if(rankOfInsurance>2) {
			policyCharge *= 0.9;
		}
		return policyCharge;
	}
}
