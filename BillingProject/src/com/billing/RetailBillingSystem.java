package com.billing;

import java.util.ArrayList;
import java.util.List;

public class RetailBillingSystem {
	private List<Product>productList=new ArrayList<Product>();
	private List<CartItem>cartItemList;
	 
	public RetailBillingSystem() {
	
	cartItemList=new ArrayList<CartItem>();
	}
	
	public void addItem(String name, double price) {
		productList.add(new Product(name,price));
		System.out.println("products are added "+name);
	}
	public void displayProducts() {
		System.err.println("Available products");
		for(Product products:productList) {
			System.out.println(products.getName()+" - $"+products.getPrice());
		}
	}
	public  Product getProductByName(String name) {
		for(Product product:productList) {
			if(product.getName().equalsIgnoreCase(name)) {
				return product;
			}
		}
		return null;
}
	public void addToCart(String productName,int quantity) {
		Product selectedProduct = getProductByName(productName);
		if(selectedProduct!=null) {
			cartItemList.add(new CartItem(selectedProduct, quantity));
			  System.out.println(quantity + " " + productName + "(s) added to the cart.");
		}
		else 
			 System.out.println("Product not found.");
		
	}
	public void displayCart() {
		for(CartItem cartItem:cartItemList) {
			System.out.println(cartItem.getQuantity() + " " + cartItem.getProduct().getName() +
                    "(s) - $" + cartItem.getTotal());
			System.out.println("Total: $" + calculateTotal());
			
		}
		
	}
	public double calculateTotal() {
		double total=0;
		for(CartItem cartItem:cartItemList) {
			total=total+cartItem.getTotal();
		}
		return total;
		
		
	}
}
