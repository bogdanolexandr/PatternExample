package com.svgatodvi;

public class Monitor implements Dvi {

	@Override
	public void transferInformation(String information) {
		System.out.println("vizualization information " + information);
	}

}
