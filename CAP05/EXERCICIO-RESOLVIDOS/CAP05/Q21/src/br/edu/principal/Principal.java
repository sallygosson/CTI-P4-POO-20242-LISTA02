package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int N,  somaN = 0, maior, menor, qtdPares = 0, qtdImpares = 0;
		double mediaPares = 0,mediaN = 0,  percentualImpar, qtdN = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		N = sc.nextInt();
		maior = N;
		menor = N;
		while (N != 30000) {
			somaN += N;
			qtdN += 1;
			if (qtdN > 1) {
				if (N > maior) {
					maior = N;
				}
				else if (N < menor) {
					menor = N;
				}
			}
			if (N % 2 == 0) {
				qtdPares += 1;
				mediaPares += N;
			}
			else {
				qtdImpares += 1;
			}
			
			System.out.print("Digite um número: ");
			N = sc.nextInt();
		}
		mediaN = somaN / qtdN;
		mediaPares /= qtdPares;
		percentualImpar = qtdImpares/qtdN;
		System.out.println("A soma dos números digitados é " + somaN);
		System.out.println("A quantidade de números digitados é " + qtdN);
		System.out.println("A média dos números digitados foi " + mediaN);
		System.out.println("O maior número digitado é " + maior);
		System.out.println("O menor número digitado foi " + menor);
		System.out.println("A media dos números pares é " + mediaPares);
		System.out.println("O percentual de números ímpares foi de " + percentualImpar);


		
		
	}
}