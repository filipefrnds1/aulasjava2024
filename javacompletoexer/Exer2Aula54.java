package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer2Aula54 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x = 0;
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < N; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in += 1;
			}else {
				out += 1;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		
		
		sc.close();
	}

}
