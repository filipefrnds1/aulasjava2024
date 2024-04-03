package javacompletoaulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula63 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X: ");
		double ax = sc.nextDouble();
		double bx = sc.nextDouble();
		double cx = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		double ay = sc.nextDouble();
		double by = sc.nextDouble();
		double cy = sc.nextDouble();
		
		double px = (ax+bx+cx)/2;
		double py = (ay+by+cy)/2;
		
		double areax = Math.sqrt(px*(px-ax)*(px-bx)*(px-cx));
		double areay = Math.sqrt(py*(py-ay)*(py-by)*(py-cy));
		
		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Triangle Y aera: %.4f%n", areay);
		
		if(areax > areay) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
