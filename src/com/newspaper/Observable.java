package com.newspaper;

public interface Observable {

	public void register(Observer observer);
	
	public void remove(Observer observer);
	
	
	
}
