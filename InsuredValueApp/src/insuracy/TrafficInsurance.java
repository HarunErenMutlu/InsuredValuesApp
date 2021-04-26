package insuracy;
/*
 * This is our TrafficInsurance class.
 * This is a derived class of Insurance.
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */
public class TrafficInsurance extends Insurance{
	public double calculatePolicyCharge(InsuredValue insuredValue) {//method that calculates policy charge. It overrides calculatePolicyCharge function.
		int rankOfInsurance = 2020 - insuredValue.getYearOfInsurance();
		double riskFactor = insuredValue.calculateRiskFactor();
		double policyCharge = (this.generateFixedFee()*0.9)+(Math.sqrt(riskFactor)*this.generateFixedFee());
		if(rankOfInsurance>1) {
			policyCharge *= 0.8 ;
		}
		return policyCharge;
	}
}
