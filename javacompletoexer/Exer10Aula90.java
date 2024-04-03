package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer10Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int N = sc.nextInt();
		
		String[] alunos = new String[N];
		double[] N1 = new double[N];
		double[] N2 = new double[N];
		double media1 = 0.0;
		
		
		for(int k = 0; k < N; k++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:\n", k+1);
			alunos[k] = sc.nextLine();
			N1[k] = sc.nextDouble();
			N2[k] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		for(int j = 0; j < N; j++) {
			media1 = (N1[j]+N2[j])/2;
			if(media1 >= 6.0) {
				System.out.println(alunos[j]);
				
			}
		}
		
		
		sc.close();
	}

}
