package com.pen;

public class Pen implements Recordable {

	public void write(Writable writable, String message) {
		writable.write(message);
	}

}
