package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer4Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int k = 0; k < n; k++) {
			System.out.print("Digite um numero: ");
			vect[k] = sc.nextInt();
		}
		
		int aux = 0;
		System.out.println("\nNUMEROS PARES: ");
		for(int j = 0; j < n; j++) {
			if(vect[j]%2 == 0) {
				System.out.print(vect[j] + "  ");
				aux += 1;
			}
		}
		
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", aux);
		
		sc.close();
	}

}
