package com.pizza;

public class Ham implements Product {

	private final double PRICE = 4.5;
	private Product product;

	public Ham(Product product) {
		this.product = product;
	}

	@Override
	public double getPrice() {
		return product.getPrice() + PRICE;
	}

}
