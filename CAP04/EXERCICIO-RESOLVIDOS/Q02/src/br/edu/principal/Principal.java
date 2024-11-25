package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a sua n1: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Insira a sua n2: ");
		double n2 = sc.nextDouble();
		
		System.out.print("Insira a sua n3: ");
		double n3 = sc.nextDouble();
		
		double med = (n1 + n2 + n3) / 3;
		
		if (med >= 0 && med < 3) {
			
			System.out.println("Sua média é: " + med + ", então foi Reprovado!");
		}
		
		else if (med <= 3 && med < 7) {
			
			double notaE = 12 - med;
			System.out.println("Sua média é: " + med + ", para passar você precisará tirar: " + notaE);
			
		}
		
		else {
			
			System.out.println("Sua média é: " + med + ", então foi Aprovado!");
		}
	}

}
