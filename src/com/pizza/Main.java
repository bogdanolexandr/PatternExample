package com.pizza;

public class Main {

	public static void main(String[] args) {

		Product pizza = new ItalianPizza();
		pizza = new Cheese(pizza);
		pizza = new Mushroom(pizza);
		pizza = new Ham(pizza);

		System.out.println("price : " + pizza.getPrice());

	}

}
