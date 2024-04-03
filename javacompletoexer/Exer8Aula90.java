package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer8Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		double media = 0.0;
		int totalmedia = 0;
		
		for(int k = 0; k < vect.length; k++) {
			System.out.print("Digite um numero: ");
			vect[k] = sc.nextInt();
			if(vect[k]%2 == 0) {
				media += (double)vect[k];
				totalmedia += 1;
			}
		}
		
		if(media == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			System.out.printf("MEDIA DOS PARES = %.1f", media/totalmedia);;
		}
		
		sc.close();
	}

}
