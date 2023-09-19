package aplication;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in Stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		
		product.setName ("Computer");
		System.out.println("updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.printf("Updated price " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantityadd = sc.nextInt();
		product.addProducts(quantityadd);
		
		System.out.println();
		System.out.println("Upadated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
		
	}

}
