package javacompletoexer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import poo.Employe;

public class Exer1Aula99 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		List<Employe> list = new ArrayList<>();
		
		for(int k = 0; k < N; k++) {
			System.out.println();
			System.out.println("Employee #" + (k+1) +":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			Double salario = sc.nextDouble();
			
			Employe emp = new Employe(id,nome,salario);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idd = sc.nextInt();
		
		Employe inc = list.stream().filter(x -> x.getId() == idd).findFirst().orElse(null);
		
		if(inc == null){
			System.out.println("This id does not exist!");
		}else{
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			inc.incrementarSalario(percent);
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employe emp : list) { //pra cada employe emp na minha lista list imprima emp
			System.out.print(emp);
			
		}
		
		
		
		sc.close();
	}

}
