package com.billing;

public class CartItem {
	private Product product;
	private int quantity;
	
	public CartItem(Product product,int quantity) {
		this.product=product;
		this.quantity=quantity;
	}
	public Product getProduct() {
		return product;
	}
	public int getTotal() {
		double totalPrice =product.getPrice()*quantity;
		return quantity;
		
	}
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

		
}
