package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

import poo.ContaBancaria;

public class Exer13Aula81 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contb;
		//ContaBancaria contb = new ContaBancaria();
		
		System.out.println("Enter account number: ");
		int numconta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if(answer == 'y') {
			System.out.println("Enter initial deposit value: ");
			double value = sc.nextDouble();
			contb = new ContaBancaria(numconta,name,value);
		}else {
			contb = new ContaBancaria(numconta,name);
		}
		
		System.out.println("Account data: ");
		System.out.println(contb);
		
		System.out.println("Enter a deposit value: ");
		contb.deposito(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(contb);
		
		System.out.println("Enter a withdraw value: ");
		contb.saque(sc.nextDouble());
		
		System.out.println(contb);
		
		
		
		
		sc.close();
	}

}
