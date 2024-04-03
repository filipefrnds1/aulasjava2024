package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer1Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		
		int[] vect = new int[n];
		
		for(int i=0; i<n;i++) {
			//sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int j = 0; j<n; j++) {
			if(vect[j] < 0) {
				System.out.printf("%d%n", vect[j]);
			}
		}
		
		
		
		
		
		
		sc.close();
	}

}
