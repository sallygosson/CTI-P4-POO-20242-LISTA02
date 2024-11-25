package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sexo, servico;
		int qtdF = 0, qtdM = 0, idade, qtdM21 = 0, qtdIdade = 0;
		double idadeMedia = 0, perc, menorIdadeF = 0, qtdPerc = 0;
		while (true) {
			
			
			System.out.print("Digite a idade do funcionário: ");
			idade = sc.nextInt();
			if (idade == 0) {
				break;
			}
			System.out.print("Informe o sexo do funcionário [F/M]: ");
			sexo = sc.next();
			while (!(sexo.equalsIgnoreCase("F")) && !(sexo.equalsIgnoreCase("M"))) {
				System.out.print("Sexo inválido, informe o sexo do funcionário [F/M]: ");
				sexo = sc.next();
			}
			System.out.print("O funcionário tem experiência? [S/N] ");
			servico = sc.next();
			while (!(servico.equalsIgnoreCase("S")) && !(servico.equalsIgnoreCase("N"))) {
				System.out.print("Resposta inválida inválido, o funcionário tem experiência? [S/N]  ");
				servico = sc.next();
			}
			
			if (sexo.equalsIgnoreCase("F")) {
				qtdF += 1;
				if ((servico.equalsIgnoreCase("S"))) {
					if (idade < 21) {
						qtdM21 += 1;
					}
					if (qtdF == 1) {
						menorIdadeF = idade;
					}
					else {
						if (idade < menorIdadeF) {
							menorIdadeF = idade;
						}
					}
				}
			}
			else {
				qtdM += 1;
				if (servico.equalsIgnoreCase("S")) {
					qtdIdade += 1;
					idadeMedia += idade;
				}
				if (idade > 45) {
					qtdPerc += 1;
				}
			}
			
			
		}
		idadeMedia = idadeMedia / qtdIdade;
		perc = qtdPerc / qtdM;
		System.out.println("A quantidade de candidatos do sexo feminino é " + qtdF);
		System.out.println("A quantidade de candidatos do sexo masculino é " + qtdM);
		System.out.println("A idade média dos homens que já têm experiência no serviço é " + idadeMedia);
		System.out.println("A porcentagem de homens com mais de 45 anos é " + perc);
		System.out.println("A quantidade de mulheres com menos de 21 anos que possuem experiência no serviço é " + qtdM21);
		System.out.println("A menor idade entre as mulheres que já têm experiência no serviço é " + menorIdadeF);




	}

}