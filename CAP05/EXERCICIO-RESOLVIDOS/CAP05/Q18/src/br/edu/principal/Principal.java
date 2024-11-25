package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double N, raiz, quadrado, cubo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		N = sc.nextDouble();
		while (N > 0) {
			quadrado = Math.pow(N, 2);
			cubo = Math.pow(N, 3);
			raiz = Math.sqrt(N);
			System.out.println("Número " + N);
			System.out.println("Quadrado: " + quadrado);
			System.out.println("Cubo: " + cubo);
			System.out.println("Raiz Quadrada: " + raiz);
			System.out.print("Digite um número: ");
			N = sc.nextDouble();
		}
		

	}

}