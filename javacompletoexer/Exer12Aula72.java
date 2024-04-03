package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

import poo.CurrencyConverter;

public class Exer12Aula72 {
	
	//public static double IOF = 0.06;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		double dollar;
		
		double quantity;
		
		//CurrencyConverter cur = new CurrencyConverter();
		
		System.out.println("What is the dollar price? ");
		dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		quantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amountPaid(dollar,quantity));
		
		
		
		
		
		sc.close();
	}

}
