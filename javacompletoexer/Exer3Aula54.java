package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer3Aula54 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double media = ((a*2.0) + (b*3.0) + (c*5.0)) / 10.0;
			
			System.out.printf("%.2f", media);
			
		}
		
		sc.close();
	}

}
