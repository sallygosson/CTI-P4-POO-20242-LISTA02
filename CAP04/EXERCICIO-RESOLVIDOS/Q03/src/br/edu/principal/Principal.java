package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double n1; double n2;
	System.out.print("Digite o primeiro número: ");
	n1 = sc.nextDouble();
	System.out.print("Digite o segundo número: ");
	n2 = sc.nextDouble();
	if (n1 > n2) {
		System.out.println("O maior número é: " + n1);
		
	}
	else if (n2 > n1) {
		System.out.println("O maior número é: " + n2);
	}
	
	else {
		System.out.println("Os números são iguais.");
	}
	}

}
