package com.newspaper;

import java.util.ArrayList;
import java.util.List;

public class Typography implements Observable {

	private List<Observer> observers = new ArrayList<>();

	public void register(Observer observer) {
		observers.add(observer);
	}

	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	public void sendOut(String newspaper) {
		for(Observer observer: observers) {
			observer.notify(newspaper);
		}
	}

}
