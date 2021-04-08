package extensions;

public class checkBattery {
	
	private static int Min_Temperature = 0;
	private static int Max_Temperature = 45;

	private static int Min_SOC = 20;
	private static int Max_SOC = 80;

	private static float Max_Charge_Rate = 0.8f;
	
	static boolean isTemperature_OK = false;
	static boolean isSOC_OK = false;
	static boolean isChargeRate_OK = false;

	public static boolean batteryIsOk(int temperature, int soc, float chargeRate, String unit) 
	{
		isTemperature_OK = checkTemperature(temperature,unit);
		isSOC_OK = checkSOC(soc);
		isChargeRate_OK = checkChargeRate(chargeRate);
		
		Main.printOutput(isTemperature_OK , isSOC_OK , isChargeRate_OK);
		
		return (isTemperature_OK && isSOC_OK && isChargeRate_OK);
	}
	
	private static boolean checkTemperature(int temperature, String unit) {
		if(unit.equals("F"))
			temperature = UnitConversion.convertFarenheitToCelsius(temperature);
		
		return new VaildateTolerance(Min_Temperature,Max_Temperature)
				.checkTemperatureRange(temperature);
	}

	private static boolean checkSOC(int soc) {
		return new VaildateTolerance(Min_SOC,Max_SOC)
				.checkSOCRange(soc);
	}
	
	private static boolean checkChargeRate(float chargeRate) {
		return new ChargeRate(Max_Charge_Rate)
				.checkChargeRate(chargeRate);
		
	}
	
}
