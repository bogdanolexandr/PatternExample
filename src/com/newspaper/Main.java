package com.newspaper;

public class Main {

	public static void main(String[] args) {
		
		Typography typography = new Typography();
		
		Subscriber[] subs = {new Subscriber("ivan", typography), new Subscriber("petro", typography), new Subscriber("george", typography)};
		for(Subscriber sub : subs) {
			sub.register();
		}
		typography.sendOut("new york times");
		
		subs[2].remove();
		
		typography.sendOut("washington post");
		
		
		
	}

}
