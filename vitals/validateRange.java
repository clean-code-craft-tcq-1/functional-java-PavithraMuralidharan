package vitals;

import java.time.temporal.ValueRange;

public class validateRange {
	int minValue;
	int maxValue;
	
	boolean flag_temperature = false;
	boolean flag_SOC = false;
	
	
	
	public validateRange(int minValue,	int maxValue) 
	{
		this.minValue = minValue;
		this.maxValue = maxValue;
		
	}
	public boolean checkTemperatureRange(int temperature) 
	{
		if(isValueInRange(minValue, maxValue, temperature))
		{
			this.flag_temperature = true;
		}
		return this.flag_temperature;
	}
	
	public boolean checkSOCRange(int soc) 
	{
		if(isValueInRange(minValue, maxValue, soc))
		{
			this.flag_SOC = true;
		}
		return this.flag_SOC;
	}
	
	boolean isValueInRange(int minValue,int maxValue,long value)
	{
		return ValueRange.of(minValue, maxValue).isValidValue(value);
	}
	
}
