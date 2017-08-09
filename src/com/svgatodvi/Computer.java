package com.svgatodvi;

public class Computer {

	private Svga svga;

	public Computer(Svga svga) {
		this.svga = svga;
	}

	public void transferSignal(String information) {
		svga.transferAnalogSignal(information);
	}

}
