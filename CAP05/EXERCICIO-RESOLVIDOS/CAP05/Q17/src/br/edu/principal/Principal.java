package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salJoao, salCarlos;
		int meses = 0;
		System.out.print("Digite o valor do salário de Carlos: ");
		salCarlos = sc.nextDouble();
		salJoao = salCarlos / 3;
		while (salJoao < salCarlos) {
			salCarlos = salCarlos * 1.02;
			salJoao = salJoao * 1.05;
			meses += 1;
		}
		System.out.println("Salário de Carlos " + salCarlos);
		System.out.println("Salário de João " + salJoao);
		System.out.println("Foram necessários " + meses + " meses para que o salário de João passasse o de Carlos...");
	}

}