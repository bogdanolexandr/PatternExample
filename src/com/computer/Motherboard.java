package com.computer;

public class Motherboard {

	private Memory memory = new Memory();
	private Processor processor = new Processor();
	private Videocard videocard = new Videocard();
	
	public void writeInformation(String information) {
		memory.writeInformation(information);
		memory.writeInformation(processor.processInformation(memory.readInformation()));
		videocard.showInformation(memory.readInformation());
	}
	
}
