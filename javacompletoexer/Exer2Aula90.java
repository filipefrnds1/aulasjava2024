package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer2Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		 
		double sum = 0.0;
		System.out.printf("%nVALORES = ");
		for(int j = 0; j < n; j++) {
			System.out.printf("%.1f  ", vect[j]);
			sum += vect[j];
		}
		
		double media = sum/n;
		
		System.out.printf("%nSOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f", media);
		
		
		
		sc.close();
	}

}
