
public class BatteryRange {
	
	private float minValue; 
	private float maxValue;
	private float chargeRate;

	public BatteryRange(float minValue, float maxValue , float chargeRate) {
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.chargeRate = chargeRate;
	}

	public float getMinValue() {
		return minValue;
	}

	public float getMaxValue() {
		return maxValue;
	}

	public float getChargeRate() {
		return chargeRate;
	}

}
