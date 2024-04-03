package javacompletoexer;

import java.util.Locale;
import java.util.Scanner;

import poo.QuartoV;

public class Exer1Aula93 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		QuartoV[] rooms = new QuartoV[10];
		
		System.out.printf("How many rooms will be rented? ");
		int N = sc.nextInt();
		
		
		String name;
		String email;
		int room;
		
		for(int k = 0; k < N; k++) {
			sc.nextLine();
			System.out.printf("%nRent #%d: %n", k+1);
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.printf("Email: ");
			email = sc.nextLine();
			System.out.printf("Room: ");
			room = sc.nextInt();
			
			rooms[room] = new QuartoV(name,email);
						
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int j = 0; j < rooms.length; j++) {
			if(rooms[j] != null) {
				System.out.printf("%d: %s%n",j, rooms[j]);
				//System.out.printf("%d: %s, %s%n", j,rooms[j].getNome(),rooms[j].getEmail());
				
			}
		}
		
		
		sc.close();
	}

}
