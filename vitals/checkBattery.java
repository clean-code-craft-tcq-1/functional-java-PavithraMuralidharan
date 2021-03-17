package extensions;

public class checkBattery {
	
	private static int Min_Temperature = 0;
	private static int Max_Temperature = 45;

	private static int Min_SOC = 20;
	private static int Max_SOC = 80;

	private static float Max_Charge_Rate = 0.8f;

	public static boolean batteryIsOk(int temperature, int soc, float chargeRate) 
	{
		boolean isTemperature_OK = checkTemperature(temperature);
		boolean isSOC_OK = checkSOC(soc);
		boolean isChargeRate_OK = checkChargeRate(chargeRate);
		
		System.out.println((!isTemperature_OK) ? "Temperature Out of Range" : "Temperature Is In Range");
		System.out.println((!isSOC_OK) ? "SOC Out of Range" : "SOC Is In Range");
		System.out.println((!isChargeRate_OK) ? "ChargeRate Out of Range" : "ChargeRate Is In Range");
		
		return (isTemperature_OK && isSOC_OK && isChargeRate_OK);
	}

	private static boolean checkTemperature(int temperature) {
		
		return new validateRange(Min_Temperature,Max_Temperature)
				.checkTemperatureRange(temperature);
	}

	private static boolean checkSOC(int soc) {
		return new validateRange(Min_SOC,Max_SOC)
				.checkSOCRange(soc);
	}
	
	private static boolean checkChargeRate(float chargeRate) {
		return new chargeRate(Max_Charge_Rate)
				.checkChargeRate(chargeRate);
		
	}
	
}
