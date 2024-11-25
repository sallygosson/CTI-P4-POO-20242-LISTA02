package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salarioBruto, salarioLiquido, desconto,mediaF = 0, mediaM = 0, qtdF = 0, qtdM = 0;
		int numH, cod = 0;
		String sexo;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Informe o sexo [M/F]: ");
			sexo = sc.next();
			while (!(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M"))) {
			    System.out.print("Sexo inválido, Informe o sexo [M/F]: ");
			    sexo = sc.next();
			}
			System.out.print("Informe a quantidade de horas trabalhadas: ");
			numH = sc.nextInt();
			System.out.print("Informe o código: ");
			cod = sc.nextInt();
			salarioBruto = numH * 30;
			if (sexo.equalsIgnoreCase("F")) {
			    desconto = salarioBruto * 0.05;
			    salarioLiquido = salarioBruto - desconto;
			    qtdF += 1;
			    mediaF += salarioLiquido;
			} else {
			    desconto = salarioBruto * 0.10;
			    salarioLiquido = salarioBruto - desconto;
			    qtdM += 1;
			    mediaM += salarioLiquido;
			}
		} while (cod != 99999);
		mediaM =  mediaM / qtdM;
		mediaF = mediaF / qtdF;
		System.out.println("A média de salário dentre os homens é de R$ " + mediaM);
		System.out.println("A média de salário dentre as mulheres é de R$ " + mediaF);
		
	}

}