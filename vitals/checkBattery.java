package vitals;

public class checkBattery {
	
	private static int Min_Temperature = 0;
	private static int Max_Temperature = 45;

	private static int Min_SOC = 20;
	private static int Max_SOC = 80;

	private static float Max_Charge_Rate = 0.8f;
	
	static boolean isTemperatureOK = false;
	static boolean isSOCOK = false;
	static boolean isChargeRateOK = false;

	public static boolean batteryIsOk(int temperature, int soc, float chargeRate) 
	{
		isTemperatureOK = checkTemperature(temperature);
		isSOCOK = checkSOC(soc);
		isChargeRateOK = checkChargeRate(chargeRate);
		
		printMessage("Temperature",isTemperatureOK);
		printMessage("SOC",isSOCOK);
		printMessage("ChargeRate",isChargeRateOK);
		
		return (isTemperatureOK && isSOCOK && isChargeRateOK);
	}
	
	static void printMessage(String type,boolean flag) {
		String msg = !flag ? "Out of Range" : "Is In Range"; 
		System.out.println(String.format("%s %s",type,msg));
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
