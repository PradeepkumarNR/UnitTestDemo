package com.cisco.stbfunctionality.remote;

public class PowerButton implements Button {
	private boolean powerStatus;


	@Override
	public boolean buttonPressed() {
		if (powerStatus) {
			powerStatus = false;
		} else {
			powerStatus = true;
		}
		return powerStatus;
	}
	
	

}
