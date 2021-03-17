public class LiIonBatteryCheck {

	public static void main(String[] args) {
		assert(BatteryRange.batteryIsOk(25, 70, 0.7f) == true);
        assert(BatteryRange.batteryIsOk(50, 85, 0.0f) == false);
        assert(BatteryRange.batteryIsOk(-1, 85, 0.0f) == false);
        assert(BatteryRange.batteryIsOk(25, 85, 0.0f) == false);
        assert(BatteryRange.batteryIsOk(25, 15, 0.0f) == false);
        assert(BatteryRange.batteryIsOk(25, 25, 0.9f) == false);
        System.out.println("Some more tests needed");
    }
	
	
}
