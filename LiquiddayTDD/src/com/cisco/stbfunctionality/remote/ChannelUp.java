package com.cisco.stbfunctionality.remote;

public class ChannelUp extends ChannelManager {

	@Override
	public int channelchange() {
		if (channelNumber == 200) {
			channelNumber = 100;
		} else {
			channelNumber++;
		}
		return channelNumber;
	}
}
