package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer7Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double sum = 0;
		for(int k = 0; k < vect.length; k++) {
			System.out.print("Digite um numero: ");
			vect[k] = sc.nextDouble();
			sum += vect[k];
		}
		
		sum = sum/vect.length;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", sum);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for(int j = 0; j < vect.length; j++) {
			if(vect[j] < sum) {
				System.out.printf("%.1f%n",vect[j]);
			}
		}
		
		
		sc.close();
	}

}
