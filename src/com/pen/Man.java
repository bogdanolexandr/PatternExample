package com.pen;

public class Man {

	private Writable surfaceForWriting;
	private Recordable recorder;

	public void takeSurfaceForWriting(Writable surface) {
		surfaceForWriting = surface;
	}

	public void takeWriting(Recordable recorder) {
		this.recorder = recorder;
	}

	public void writeOnSurface(String message) {
		recorder.write(surfaceForWriting, message);
	}

	public void readFromSurface() {
		System.out.println(surfaceForWriting.read());
	}
	
}
