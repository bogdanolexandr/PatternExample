package com.computer;

public class Computer {

	private Motherboard motherboard = new Motherboard();
	private HardDisk hardDisk = new HardDisk();
	
	public void switchOn() {
		motherboard.writeInformation(hardDisk.readInformation());
	}
	
}
