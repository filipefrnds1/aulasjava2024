package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer5Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		
		for(int k = 0; k <vect.length; k++) {
			System.out.print("Digite um numero: ");
			vect[k] = sc.nextDouble();
		}
		
		double maiorvalor = vect[0];
		int pos = 0;
		for(int j = 0; j < vect.length; j++) {
			if(vect[j] > maiorvalor) {
				maiorvalor = vect[j];
				pos = j;				
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f%n", maiorvalor);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", pos);
		sc.close();
	}

}
