import java.time.temporal.ValueRange;

public class BatteryRange {
	
	private static int Min_Temperature = 0;
	private static int Max_Temperature = 45;

	private static int Min_SOC = 20;
	private static int Max_SOC = 80;

	private static float Charge_Rate = 0.8f;
	
	static boolean isValueInRange(long min,long max,long value)
	{
		return ValueRange.of(min, max).isValidValue(value);
		
	}
	
	static boolean isChargeRateOk(float maxRate, float value)
	{
		return (value > maxRate);
	}
	
	static boolean batteryIsOk(int temperature, int soc, float chargeRate) {
       
        return (checkTemperature(temperature) && checkSOC(soc) && checkChargeRate(chargeRate));
    }
	
	static boolean checkTemperature(int temperature)
	{		
		if(!isValueInRange(Min_Temperature, Max_Temperature, temperature))
		{
			printErrorMessage("Temperature");
			return false;
		}
		return true;
	}
	
	static boolean checkSOC(int soc)
	{
		if(!isValueInRange(Min_SOC, Max_SOC, soc))
		{
			printErrorMessage("SOC");
			return false;
		}
		return true;
	}
	
	static boolean checkChargeRate(float chargeRate)
	{
		if(!isChargeRateOk(Charge_Rate,chargeRate))
		{
			printErrorMessage("Charge_Rate");
			return false;
		}
		return true;
	}
	
	private static void printErrorMessage(String category) 
	{
		System.out.println(String.format("%s is out of range",category));
	} 

}
