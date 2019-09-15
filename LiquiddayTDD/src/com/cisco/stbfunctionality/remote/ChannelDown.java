package com.cisco.stbfunctionality.remote;

public class ChannelDown extends ChannelManager {


	@Override
	public int channelchange() {
		if(channelNumber==100){
			channelNumber=200;
			
		}else{
		channelNumber--;
		}
		return channelNumber;
	}


}
