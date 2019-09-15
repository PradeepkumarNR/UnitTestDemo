package com.cisco.stbfunctionality.remote;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoteControlTest {

	private RemoteControl remotecontrol;

	@Before
	public void setUp() throws Exception {
		remotecontrol = new RemoteControl(new PowerButton(), new VolumeUp(),
				new VolumeDown(), new ChannelUp(), new ChannelDown(),
				new Resetvolume());

	}

	@After
	public void tearDown() throws Exception {
		remotecontrol.resetChannel();
	}

	@Test
	public void stb_should_power_on() {
		Assert.assertEquals(true, remotecontrol.powerTogler());
	}

	@Test
	public void stb_should_power_off() {
		// turn on and then off
		remotecontrol.powerTogler();
		Assert.assertEquals(false, remotecontrol.powerTogler());
	}

	@Test
	public void stb_should_increase_volume() {
		Assert.assertEquals(1, remotecontrol.volumeup());
	}

	@Test
	public void stb_should_decrease_volume() {
		Assert.assertEquals(0, remotecontrol.volumedown());
	}

	@Test
	public void stb_should_increment_channel() {
		Assert.assertEquals(101, remotecontrol.channelup());

	}

	@Test
	public void increase_channel_5_times_should() throws Exception {
		for (int i = 0; i < 4; i++) {
			remotecontrol.channelup();
		}
		Assert.assertEquals(105, remotecontrol.channelup());

	}

	@Test
	public void decrement_channel_5_times() throws Exception {
		for (int i = 0; i < 4; i++) {
			remotecontrol.channeldown();
		}
		Assert.assertEquals(196, remotecontrol.channeldown());
	}

	@Test
	public void increase_volume_5_times() throws Exception {
		for (int i = 0; i < 5; i++) {
			remotecontrol.volumeup();
		}
		Assert.assertEquals(6, remotecontrol.volumeup());
	}

	@Test
	public void decrease_volume_5_times() throws Exception {
		for (int i = 5; i <= 0; i--) {
			remotecontrol.volumedown();
		}
		Assert.assertEquals(0, remotecontrol.volumedown());
	}

	@Test
	public void channel_should_cycle() throws Exception {
		for (int i = 100; i <= 200; i++) {
			remotecontrol.channelup();
		}
		Assert.assertEquals(101, remotecontrol.channelup());

	}

	@Test
	public void decrement_channel() throws Exception {
		Assert.assertEquals(200, remotecontrol.channeldown());
	}

	@Test
	public void resetvolume() throws Exception {
		Assert.assertEquals(0, remotecontrol.resetvolume());

	}

	@Test
	public void channel_should_cyle_decremently() throws Exception {
		for (int i = 1; i <= 100; i++) {
			remotecontrol.channeldown();
		}
		Assert.assertEquals(100, remotecontrol.channeldown());
	}

	@Test
	public void volume_increase_and_decrease() throws Exception {

		remotecontrol.volumeup();
		Assert.assertEquals(2, remotecontrol.volumeup());

		Assert.assertEquals(1, remotecontrol.volumedown());

	}

}
