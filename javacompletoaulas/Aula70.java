package javacompletoaulas;

import java.util.Locale;
import java.util.Scanner;

import poo.Calculator;

public class Aula70 {
	public static final double PI = 3.14159; // final serve para informar que é constante 
											// e sempre colocar a variavel com letra maiúscula				
	public static void main(String[] args) { // você não pode chamar metodos que não sejam estaticos dentro de metodos estáticos
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Calculator calc = new Calculator();
		
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		
		System.out.printf("Volume: %.2f%n", v);
		
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
