package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, media, mediaClasse, tClasse = 0;
		int tAp = 0, tEx = 0, tRe = 0, cont;

		for(cont = 1; cont <= 6; cont++) {
			
			System.out.print("Digite a primeira nota: ");
			n1 = sc.nextDouble();
			
			System.out.print("Digite a segunda nota: ");
			n2 = sc.nextDouble();
			
			media = (n1 + n2) / 2;
			
			System.out.println("A média do aluno " + cont + " é: " + media);
			
			if(media <= 3) {
				tRe ++;
				System.out.println("Aluno " + cont + " REPROVADO.");	
			}
			
			else if (media > 3 && media < 7) {
				tEx ++;
				System.out.println("Aluno " + cont + " em EXAME.");	
			}
			
			else {
				tAp ++;
				System.out.println("Aluno " + cont + " APROVADO.");	
			}
			
			tClasse = tClasse + media;
			
		}
		
		System.out.println("Quantidade de Alunos Reprovados: " + tRe );	
		System.out.println("Quantidade de Alunos em Exame: " + tEx );	
		System.out.println("Quantidade de Alunos Aprovados: " + tAp );
		
		mediaClasse = tClasse/ 6;
		System.out.println("A média da classe foi: " + mediaClasse );	
		
	}

}