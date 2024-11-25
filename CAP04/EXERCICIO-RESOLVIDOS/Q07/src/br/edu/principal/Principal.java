package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		double A, B, C, maior, menor, meio;
		System.out.print("Digite um valor para A: ");
		A = sc.nextDouble();
		System.out.print("Digite um valor para B: ");
		B = sc.nextDouble();
		System.out.print("Digite um valor para C: ");
		C = sc.nextDouble();
		System.out.print("Digite um valor para i (1,2,3): ");
		i = sc.nextInt();
		
		if ((A > B) && (A > C)) {
			maior = A;
			if (B < C) {
				menor = B;
			}
			else {
				menor = C;
			}
		}
		else if ((B > A) && (B > C)) {
			maior = B;
			if (A > C) {
				menor = C;
			}
			else {
				menor = A;
			}
			
		}
		else {
			maior = C;
			if (A > B) {
				menor = B;
			}
			else {
				menor = A;
			}
		}
		
		meio = A + B + C - menor - maior;
		
		if (i == 1) {
			System.out.println(menor + " - " + meio + " - " + maior);
		}
		else if (i == 2) {
			System.out.println(maior + " - " + meio + " - " + menor);

		}
		else {
			System.out.println(menor + " - " + maior + " - " + meio);

		}

	}

}
