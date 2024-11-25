package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double num1, num2, soma, raiz, op;
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU: ");
		System.out.println("1 - Somar dois números: ");
		System.out.println("2 - Raiz quadrada de um número: ");
		System.out.println("digite sua opção: ");
		op = sc.nextInt();
		if (op == 1) {
			System.out.print("digite o primeiro número: ");
			num1 = sc.nextInt();
			System.out.print("digite o segundo número: ");
			num2 = sc.nextInt();
			soma = num1 + num2;
			System.out.print("A soma dos números é : " + soma);

		}
		else if (op == 2) {
			System.out.print("digite um número: ");
			num1 = sc.nextInt();
			raiz = Math.sqrt(num1);
			System.out.println("A raiz é " + raiz);
		
		}
		else {
			System.out.println("Opção inválida!");
		}
	}
}
