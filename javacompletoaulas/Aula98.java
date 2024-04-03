package javacompletoaulas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula98 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Filipe");
		list.add("Anna");
		list.add("Bob");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
				
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("------------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		System.out.println(name2);
		/*List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Filipe");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		//list.remove("Anna");
		//list.remove(1);
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); // Todo string x tal que x.charAt(0) seja igual a M
		// pega um valor x do tipo string e me retorna se esse x.charat0 é igual a M
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("--------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("--------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		System.out.println(name2);
		*/
	}

}
