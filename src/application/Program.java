package application;

import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de quartos a serem alugados: ");
		int qtd = sc.nextInt();
		
		Room[] vect = new Room[10];
		
		for(int i=1; i<=qtd; i++) {
			System.out.printf("ID #%d: ", i);
			System.out.println();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int qrt = sc.nextInt();
			System.out.println();
			
			if(vect[qrt] != null) {
				System.out.println("Quarto ocupado, iforme outro quarto!");
				System.out.println("Quarto: ");
				qrt = sc.nextInt();
				vect[qrt] = new Room(nome, email);
			}
			else {
				vect[qrt] = new Room(nome, email);
			}
		}
		
		System.out.println("Quartos ocupados:");
		for(int i=0; i<vect.length; i++) {
            
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
		
		
		sc.close();
	}

}
