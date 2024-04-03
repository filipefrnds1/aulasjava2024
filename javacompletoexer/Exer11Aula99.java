package javacompletoexer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import poo.Employe;

public class Exer11Aula99 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		List<Employe> list = new ArrayList<>();
		
		System.out.println();
		for(int k = 0; k < N; k++) {
			
			System.out.println("Employee #" + (k+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(list,id)) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			Employe emp = new Employe(id,name,salary);
			
			list.add(emp);
									
		}
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idd = sc.nextInt();
		
		Employe empp = list.stream().filter(x -> x.getId() == idd).findFirst().orElse(null);
		
		if(empp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			Double percet = sc.nextDouble();
			empp.incrementarSalario(percet);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for(Employe empl : list) {
			System.out.print(empl);
		}
		
		
		
		
		
		
		
		sc.close();
	}
	
	public static boolean hasId(List<Employe> list, int id) {
		Employe emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}
