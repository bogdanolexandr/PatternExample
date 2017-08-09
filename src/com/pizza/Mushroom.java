package com.pizza;

public class Mushroom implements Product {

	private final double PRICE = 3.2;
	private Product product;

	public Mushroom(Product product) {
		this.product = product;
	}

	@Override
	public double getPrice() {
		return product.getPrice() + PRICE;
	}

}
