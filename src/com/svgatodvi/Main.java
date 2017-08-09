package com.svgatodvi;

public class Main {

	public static void main(String[] args) {
		
		Dvi monitor = new Monitor();
		Svga svgaToDviAdapter = new SvgaToDviAdapter(monitor);
		Computer computer = new Computer(svgaToDviAdapter);
		computer.transferSignal("hello world");
		
	}

}
