package com.computer;

public class Memory {

	private String information;
	
	public void writeInformation(String information) {
		this.information = information;
		System.out.println("store information in ram");
	}
	
	public String readInformation() {
		System.out.println("getting information from ram");
		return information;
	}
	
}
