package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double N, M, soma, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor para M: ");
		M = sc.nextDouble();
		System.out.print("Digite um valor para N: ");
		N = sc.nextDouble();
		
		while (M < N) {
			soma = 0;
			count = M;
			while (count <= N) {
				soma += count;
				count++;
			}
			System.out.println("A soma dos valores entre " + M + " e " + N + " é " + soma);
			System.out.print("Digite um valor para M: ");
			M = sc.nextDouble();
			System.out.print("Digite um valor para N: ");
			N = sc.nextDouble();
		}
		

	}

}