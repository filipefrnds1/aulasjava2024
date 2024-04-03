package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

import poo.PessoaV;

public class Exer3Aula90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		PessoaV[] pessoa = new PessoaV[n];
		
		String nome;
		int idade = 0;
		double altura = 0.0;
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n",i+1);
			System.out.printf("Nome: ");
			nome = sc.nextLine();
			System.out.printf("Idade: ");
			idade = sc.nextInt();
			sc.nextLine();
			System.out.printf("Altura: ");
			altura = sc.nextDouble();
			pessoa[i] = new PessoaV(nome,idade,altura);
		}
		
		double altmedia = 0.0;
		
		for(int j = 0; j < pessoa.length; j++) {
			altmedia += pessoa[j].getAltura();
			
		}
		altmedia = altmedia/pessoa.length;
		
		System.out.printf("%nAltura média: %.2f%n", altmedia);
		
		double aux = 0;
		for(int k = 0; k < pessoa.length; k++) {
			if(pessoa[k].getIdade() < 16) {
				aux += 1;
			}
		}
		
		double porcent = (aux/pessoa.length)*100;
		
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcent);
		
		for(int l = 0; l < pessoa.length; l++) {
			if(pessoa[l].getIdade() < 16) {
				System.out.println(pessoa[l].getNome());
			}
		}
		
		
		sc.close();
	}

}
