package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;


public class Exer4Aula54 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b == 0) {
				System.out.println("divisao impossivel");
			}else {
				double div = (double) a/b;
				System.out.printf("%.1f", div);
			}
		}
		
		
		sc.close();
	}

}
