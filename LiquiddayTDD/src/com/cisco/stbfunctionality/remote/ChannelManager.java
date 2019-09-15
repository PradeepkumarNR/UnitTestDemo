package com.cisco.stbfunctionality.remote;

public abstract class ChannelManager {

	protected static int channelNumber = 100;

	public abstract int channelchange();

	public int resetChannel() {
		channelNumber = 100;
		return channelNumber;
	}

}
