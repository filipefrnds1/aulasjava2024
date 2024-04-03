package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer11Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		
		double[] alt = new double[N];
		char[] gen = new char[N];
		
		double menoralt, maioralt, mediaaltm;
		int numh,numm;
		
		for(int k = 0; k < N; k++) {
			
			System.out.printf("Altura da %dª pessoa: ", k+1);
			alt[k] = sc.nextDouble();
			System.out.printf("Genero da %dª pessoa: ", k+1);
			gen[k] = sc.next().charAt(0);
		}
		
		menoralt = alt[0];
		maioralt = alt[0];
		mediaaltm = 0.0;
		numh = 0;
		numm = 0;
		
		for(int i = 0; i < N; i++) {
			if(menoralt > alt[i]) {
				menoralt = alt[i];
			}
			if(maioralt < alt[i]) {
				maioralt = alt[i];
			}
			if(gen[i] == 'F') {
				mediaaltm += alt[i];
				numm += 1;
			}else {
				numh += 1;
			}
		}
		
		mediaaltm = mediaaltm/numm;
		
		System.out.printf("Menor altura = %.2f%n", menoralt);
		System.out.printf("Maior altura = %.2f%n", maioralt);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaaltm);
		System.out.printf("Numero de homens = %d", numh);
		
		sc.close();
	}

}
