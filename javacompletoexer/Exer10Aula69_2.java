package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

import poo.Employee;

public class Exer10Aula69_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: " + emp.toString());
		
		System.out.println("Which percentage to increase salary? ");
		emp.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + emp.toString());
		
		
		
		sc.close();
	}

}
