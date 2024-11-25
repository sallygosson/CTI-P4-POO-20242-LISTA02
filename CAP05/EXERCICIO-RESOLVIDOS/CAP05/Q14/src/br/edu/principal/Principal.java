package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorInicial, juros, valorParcela, total, valorJuros, numParc;
		int i;
		
		System.out.print("Digite o valor inicial da divida: ");
		valorInicial = sc.nextDouble();
		
		juros = 0;
		numParc = 1;
		total = valorInicial;
		valorParcela = valorInicial;
		
		System.out.println("O total é: " + total);
		System.out.println("O juros é: " + juros);
		System.out.println("O número de parcelas: " + numParc);
		System.out.println("O valor da parcela: " + valorParcela);
		
		juros = juros + 10;
		numParc = numParc + 2;
		
		for (i = 1; i <= 4; i++) {
			valorJuros = valorInicial * juros / 100;
			total = valorInicial + valorJuros;
			valorParcela = total / numParc;
			
			System.out.println("O total é: " + total);
			System.out.println("O juros é: " + juros);
			System.out.println("O número de parcelas: " + numParc);
			System.out.println("O valor da parcela: " + valorParcela);
			
			juros = juros + 5;
			numParc = numParc + 3;
			
		}
	
	}

}