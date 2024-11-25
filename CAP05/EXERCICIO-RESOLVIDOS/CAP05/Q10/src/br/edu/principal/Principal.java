package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantMenores = 0, contTime, contJog, idade, total80 = 0;
		double mediaIdade, mediaAltura = 0, peso, altura, porcentagem; 
		
		for (contTime = 1; contTime <=5; contTime++) {
			
			mediaIdade = 0;
			
			for(contJog = 1; contJog <= 11; contJog++) {
				
				System.out.print("Digite a idade do jogadagor " + contJog + " do time " + contTime + ": " );
				idade = sc.nextInt();
				
				System.out.print("Digite a peso do jogadagor " + contJog + " do time " + contTime + ": " );
				peso = sc.nextDouble();
				
				System.out.print("Digite a altura do jogadagor " + contJog + " do time " + contTime + ": " );
				altura = sc.nextDouble();
				
				if (idade < 18) {
					quantMenores ++;
				}
				
				mediaIdade = mediaIdade + idade;
				mediaAltura = mediaAltura + altura;
				
				if (peso > 80) {
					total80 ++;
				}
				
			}
			
			mediaIdade = mediaIdade/11;
			System.out.println("A média de idade do time " + contTime + " é de: " + mediaIdade);
			
		}
		
		System.out.println("A quaantidade de jogadores menores de idade no campeonato é: " + quantMenores );
		
		mediaAltura = mediaAltura/ 55;
		System.out.println("A altura média dos jogadores do campeonato é: " + quantMenores );
		
		porcentagem = total80 * 0.55;
		
		System.out.println("A porcentagem de jogadores com mais de 80 kg é de: " + porcentagem );
	}

}
