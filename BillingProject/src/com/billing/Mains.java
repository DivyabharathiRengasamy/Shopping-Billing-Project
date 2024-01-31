package com.billing;

import java.util.Scanner;

public class Mains {
	  static Scanner scanner = new Scanner(System.in);
	  
	  
	public static void main(String[] args) {
		RetailBillingSystem retailBillingSystem=new RetailBillingSystem();
		while(true) {
		
		System.out.println("Retail Billing System \n1. Add Product\n2. Display Products\n3. Add to Cart\n4. Display Cart\n5. Exit");
		System.out.println("please enter your choice");
		
		int userOption=scanner.nextInt();
		switch(userOption){
		case 1:
			System.out.println("Enter product name");
			String productName=scanner.next();
			System.out.println("Enter price");
			double price=scanner.nextDouble();
			retailBillingSystem.addItem(productName, price);
			break;
			
		case 2:
			
			retailBillingSystem.displayProducts();
			break;
		case 3:
			System.out.println("Enter product name for add to cart");
			String name=scanner.next();
			System.out.println("Enter quantity for add to cart");
			int quantity=scanner.nextInt();
			retailBillingSystem.addToCart(name, quantity);
			break;
		
		case 4:
			System.out.println("Shopping Cart:");
			retailBillingSystem.displayCart();
			break;

        case 5:
            System.out.println("Exiting the program. Thank you!");
            System.exit(0);

        default:
            System.out.println("Invalid choice. Please enter a valid option.");
			
		}
		
		
	}
	}

}
