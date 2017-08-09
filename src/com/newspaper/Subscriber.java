package com.newspaper;

public class Subscriber implements Observer {

	private Observable typography;
	private String name;
	
	public Subscriber(String name, Observable typography) {
		this.name = name;
		this.typography = typography;
	}
	
	public void register() {
		typography.register(this);
	}
	
	public void remove() {
		typography.remove(this);
	}

	@Override
	public void notify(String newspaper) {
		System.out.println(name + ": I've got a newspaper " + newspaper );
	}

}
