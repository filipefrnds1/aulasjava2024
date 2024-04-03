package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer6Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vecta = new int[n];
		int[] vectb = new int[n];
		int[] vectc = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < vecta.length; i++) {
			vecta[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int k = 0; k < vectb.length; k++) {
			vectb[k] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int j = 0; j < vectc.length; j++) {
			vectc[j] = vecta[j] + vectb[j];
			System.out.println(vectc[j]);
		}
		
		sc.close();
	}

}
