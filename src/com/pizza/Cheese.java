package com.pizza;

public class Cheese implements Product {

	private final double PRICE = 2;
	private Product product;

	public Cheese(Product product) {
		this.product = product;
	}

	@Override
	public double getPrice() {
		return product.getPrice() + PRICE;
	}

}
