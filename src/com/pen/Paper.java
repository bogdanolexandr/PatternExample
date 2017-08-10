package com.pen;

public class Paper implements Writable {

	private String message = " ";
	
	@Override
	public void write(String message) {
		this.message = message;
	}

	@Override
	public String read() {
		return message;
	}

}
