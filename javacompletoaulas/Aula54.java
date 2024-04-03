package javacompletoaulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula54 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double celsius = 0;
		char sn;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();
			double f = ((9*celsius)/5)+32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n ", f);
			System.out.println("Deseja repetir (s/n)? ");
			sn = sc.next().charAt(0);
		}while(sn == 's');
		
		sc.close();

	}

}
