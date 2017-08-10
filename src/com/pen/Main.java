package com.pen;

public class Main {

	public static void main(String[] args) {
		
		Writable paper = new Paper();
		Recordable pen = new Pen();
		Man man = new Man();
		man.takeSurfaceForWriting(paper);
		man.takeWriting(pen);
		man.writeOnSurface("this is my message");
		man.readFromSurface();
		
	}

}
