package javacompletoaulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula60 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double y = 25.0;
		double x = Math.sqrt(y);
		
		System.out.println(x);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("Higher = " + a);
			
		}else if(b > c) {
			System.out.println("Higher = " + b);
		}else {
			System.out.println("Higher = " + c);
		}
		
		int higher = max(a,b,c);
		showResult(higher);
		
		
		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		
		int aux;
		if(a > b && a > c) {
			aux = a;
			
		}else if(b > c) {
			aux = b;
		}else {
			aux = c;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
