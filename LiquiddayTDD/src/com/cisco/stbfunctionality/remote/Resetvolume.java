package com.cisco.stbfunctionality.remote;

public class Resetvolume extends VolumeManager {

	@Override
	public int execute() {
		volumelevel = 0;
		return volumelevel;
	}

}
