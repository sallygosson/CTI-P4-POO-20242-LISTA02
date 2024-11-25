package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, quant, res;
		
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		quant = 0;
		
		for (i = 1; i <= n; i++) {
			res = n % i;
			if (res == 0) {
				quant++;
			}
		}
		
		if (quant > 2) {
			System.out.println("Não é primo.");
		}
		
		else {
			System.out.println("É primo.");
		}
		
		
		
	}
}
