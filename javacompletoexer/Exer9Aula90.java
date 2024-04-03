package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

public class Exer9Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();
		
		String[] nome = new String[N];
		int[] idade = new int[N];
		
		for(int k = 0; k < N; k++) {
			System.out.printf("Dados da %dª pessoa:\n", k+1);
			System.out.print("Nome: ");
			nome[k] = sc.next();
			//sc.nextLine();
			System.out.print("Idade: ");
			idade[k] = sc.nextInt();
			
		}
		
		/*int mv = idade[0];
		String mv2 = nome[0];
		
		
		for(int j = 0; j < N; j++) {
			if(mv < idade[j]) {
				mv = idade[j];
				mv2 = nome[j];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: ");
		System.out.println(mv2);
		*/
		 int maioridade = idade[0];
		 int  posicaomaior = 0;

		    for (int i=1; i<N; i++) {
		        if (idade[i] > maioridade) {
		            maioridade = idade[i];
		            posicaomaior = i;
		        }
		    }

		    System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicaomaior]);
		
		sc.close();
	}

}
