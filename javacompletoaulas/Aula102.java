package javacompletoaulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula102 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] mat = new int[N][N];
		
		for(int col = 0; col < mat.length; col++) {
			for(int lin = 0; lin < mat[col].length; lin++) {
				mat[col][lin] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				
				if(mat[i][j] < 0) {
					count += 1;
				}
			}
		}
		
		System.out.print("Negative numbers: " + count);
		
		sc.close();
	}

}
