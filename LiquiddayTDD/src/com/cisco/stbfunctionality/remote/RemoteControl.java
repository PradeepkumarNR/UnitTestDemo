package com.cisco.stbfunctionality.remote;

public class RemoteControl {

	//private PowerButton powerStatus;

	private VolumeUp volumeup ;
	
	private VolumeDown volumedown;

	private ChannelUp channelUp;
	
	private ChannelDown channelDown;
	
	private Resetvolume resetvolume;
	
	private Button	powerbutton;
	
	public RemoteControl(Button powerbutton, VolumeUp volumeUp, VolumeDown volumedown,
			ChannelUp channelUp, ChannelDown channelDown,Resetvolume resetvolume) {
		this.powerbutton = powerbutton;
		this.volumeup = volumeUp;
		this.volumedown=volumedown;
		this.channelUp = channelUp;
		this.channelDown=channelDown;
		this.resetvolume=resetvolume;
	}
	

	public boolean powerTogler() {
		
		return powerbutton.buttonPressed();

	//	return powerStatus.buttonPressed();
	}

	public int volumedown() {

		return volumedown.execute();
	}

	public int volumeup() {

		return volumeup.execute();
	}

	public int channelup() {

		return channelUp.channelchange();
	}

	public int channeldown() {

		return channelDown.channelchange();
	}

	public int resetvolume() {
			
		return resetvolume.execute();
	}


	public int resetChannel() {
		return channelDown.resetChannel();
	}

}
