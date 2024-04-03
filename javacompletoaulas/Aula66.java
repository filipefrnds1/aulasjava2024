package javacompletoaulas;

import java.util.Locale;
import java.util.Scanner;
import poo.Produto;


public class Aula66 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Produto prod;
		//prod = new Produto();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		//System.out.println("Quantity in stock: ");
		//int quantity = sc.nextInt();
		
		
		
		Produto prod = new Produto(name, price);
		
		prod.setName("computador");
		System.out.println("Update name: " + prod.getName());
		prod.setPrice(1200);
		System.out.println("Update price: " + prod.getPrice());
		
		System.out.println("Product data: " + prod);
		//System.out.println("Product data: " + prod.name + ", $ " + prod.price + ", " + prod.quantity + " units, Total: $ " + prod.totalValueInStock());
		
		System.out.println("Enter the number of products to be added in stock: ");
		prod.addProducts(sc.nextInt());
		System.out.println("Update data: " + prod);	
		//System.out.println("Update data: " + prod.name + ", $ " + prod.price + ", " + prod.quantity + " units, Total: " + prod.totalValueInStock());
		
		System.out.println("Enter the number of products to be removed from stock: ");
		prod.removeProducts(sc.nextInt());
		System.out.println("Update data: " + prod);
		//System.out.println("Update data: " + prod.name + ", $ " + prod.price + ", " + prod.quantity + " units, Total: " + prod.totalValueInStock());
		
		
		
		
		sc.close();
	}

}
