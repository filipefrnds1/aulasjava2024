package javacompletoaulas;

import java.util.Locale;
import java.util.Scanner;

import poo.ProductV;

public class Aula89 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		ProductV[] vect = new ProductV[n];
		
		
		
		
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductV(name,price);
			
		}
		
		double sum = 0.0;
		for(int j = 0; j<vect.length; j++) {
			sum += vect[j].getPrice();
			//System.out.println(vect[j].getName() + " " + vect[j].getPrice());
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		sc.close();
	}

}
