package extensions;

public class Main {
	
	static void printOutput(boolean isTemperature_OK, boolean isSOC_OK, boolean isChargeRate_OK)
	{
		Message.printMessage((!isTemperature_OK) ? "Temperature Out of Range" : "Temperature Is In Range");
		Message.printMessage((!isSOC_OK) ? "SOC Out of Range" : "SOC Is In Range");
		Message.printMessage((!isChargeRate_OK) ? "ChargeRate Out of Range" : "ChargeRate Is In Range");
	}
	
	public static void main(String[] args) {
		
		
		  assert(checkBattery.batteryIsOk(28, 70, 0.7f,"F") == true);
		  assert(checkBattery.batteryIsOk(50, 85, 0.0f,"C") == false);
		  assert(checkBattery.batteryIsOk(-1, 85, 0.0f,"C") == false);
		  assert(checkBattery.batteryIsOk(123, 85, 0.0f,"F") == false);
		  assert(checkBattery.batteryIsOk(25, 15, 0.0f,"F") == false);
		  assert(checkBattery.batteryIsOk(25, 25, 0.9f,"C") == false);
		 
      System.out.println("Some more tests needed");
  }
}
