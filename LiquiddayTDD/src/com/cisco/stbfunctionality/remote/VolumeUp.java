package com.cisco.stbfunctionality.remote;

public class VolumeUp extends VolumeManager {

	@Override
	public int execute() {
		if (volumelevel < 100) {
			volumelevel++;
		}
		return volumelevel;
	}

}
