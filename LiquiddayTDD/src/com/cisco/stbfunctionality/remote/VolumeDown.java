package com.cisco.stbfunctionality.remote;

public class VolumeDown extends VolumeManager {

	@Override
	public int execute() {
		if (volumelevel > 0) {
			volumelevel--;
		}
		return volumelevel;
	}

}
