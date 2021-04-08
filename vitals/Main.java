package extensions;

public class Main {
	
	public static void main(String[] args) {
		
		
		  assert(checkBattery.batteryIsOk(28, 70, 0.7f) == true);
		  assert(checkBattery.batteryIsOk(50, 85, 0.0f) == false);
		  assert(checkBattery.batteryIsOk(-1, 85, 0.0f) == false);
		  assert(checkBattery.batteryIsOk(123, 85, 0.0f) == false);
		  assert(checkBattery.batteryIsOk(25, 15, 0.0f) == false);
		  assert(checkBattery.batteryIsOk(25, 25, 0.9f) == false);
		 
      System.out.println("Some more tests needed");
  }
}
