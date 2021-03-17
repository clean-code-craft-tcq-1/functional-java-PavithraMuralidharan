package extensions;

public class chargeRate {

	float maxValue;
	boolean flag_chargeRate = false;
	
	public chargeRate(float maxValue) 
	{
		this.maxValue = maxValue;
	}
	
	public boolean checkChargeRate(float chargeRate) 
	{
		if(!isChargeRateOK(chargeRate))
		{
			this.flag_chargeRate = true;
		}
		return flag_chargeRate;
		
	}
	
	boolean isChargeRateOK(float chargeRate)
	{
		if(chargeRate > maxValue)
		{
			return true;
		}
		return false;

	}
	
}
