package javacompletoexer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import poo.EmployeeList;

public class ExerAula99 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		List<EmployeeList> list = new ArrayList<>();
		
		for(int k = 0; k < N; k++) {
			System.out.printf("Employee #%d%n", k+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list,id)) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			EmployeeList emp = new EmployeeList(id,name,salary);
			
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idemp = sc.nextInt();
		
		EmployeeList idempl = list.stream().filter(x -> x.getId() == idemp).findFirst().orElse(null);
		//Integer pos = position(list, idemp);
		
		if(idempl == null) {
			System.out.println("This id does not exist!");
			
		}else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			idempl.percent(percent);
		}
		
		System.out.println("List of employees: ");
		for(EmployeeList emp : list) {
			System.out.print(emp);
		}
		
		
		
		
		sc.close();
	}
	public static Integer position(List<EmployeeList> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	public static boolean hasId(List<EmployeeList> list, int id) {
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
