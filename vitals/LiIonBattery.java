
public class LiIonBattery {
	
	static boolean isBatteryOK(float temperature, float soc, float chargeRate) {
    	boolean isTempOk = chargeTemparatureInRange(temperature);
    	boolean issocOk = socInRange(soc);
    	boolean ischargeRateOk = chargeRateInRange(chargeRate);
    	return (isTempOk && issocOk && ischargeRateOk);        
    }
    
    static boolean chargeTemparatureInRange(float tempVal) {  
    	BatteryRange temperature = new BatteryRange(0,45,0);
    	return inRange("Temperature",tempVal,temperature);
    }

    static boolean socInRange(float socVal) {
    	BatteryRange soc = new BatteryRange(20,80,0);
    	return inRange("SOC",socVal,soc);
    }
    
    static boolean chargeRateInRange(float chargeRateVal) {
    	BatteryRange chargeRate = new BatteryRange(0,0,0.8f);
    	return inRange("ChargeRate",chargeRateVal,chargeRate);
    }
       
    static boolean inRange(String type,float value,BatteryRange cond) {
    	if(type.equals("ChargeRate"))
    		return (value > cond.getChargeRate());
    	else
    		return (value < cond.getMinValue() && value > cond.getMaxValue());
    }    

    public static void main(String[] args) {
    	assert(LiIonBattery.isBatteryOK(25, 70, 0.7f) == true);
        assert(LiIonBattery.isBatteryOK(50, 85, 0.0f) == false);
        assert(LiIonBattery.isBatteryOK(-1, 85, 0.0f) == false);
        assert(LiIonBattery.isBatteryOK(25, 85, 0.0f) == false);
        assert(LiIonBattery.isBatteryOK(25, 15, 0.0f) == false);
        assert(LiIonBattery.isBatteryOK(25, 25, 0.9f) == false);
    }
}
