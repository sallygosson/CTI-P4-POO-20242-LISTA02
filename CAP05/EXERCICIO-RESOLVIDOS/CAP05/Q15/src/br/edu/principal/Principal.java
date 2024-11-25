package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdB, qtdN, qtdC, i;
		double maiorP, menorP, totImp, preco, custoEst, imp, precoFinal, adicional;
		String refri, categ;
		
		menorP = 0;
		maiorP = 0;
		custoEst = 0;
		refri = "";
		categ = "";
		adicional = 0;
		totImp = 0;
		qtdB = 0;
		qtdN = 0;
		qtdC = 0;
		preco = 0;
		
		for (i = 1; i <= 12; i ++) {
			
			System.out.print("Digite o preço: ");
			preco = sc.nextDouble();
			
			while (true) {
				System.out.print("Digite se precisa de refrigeração [S (sim) / N (não): ");
				refri = sc.next();
				
				if (refri.equals("S") || refri.equals("N")) {
					break;
				}
				
				else {
					System.out.println("ERRO!!! TENTE NOVAMENTE!");
				}
			}
			
			while (true) {
				System.out.print("Digite a categoria a qual pertence [A — alimentação / L — limpeza / e V — vestuário]: ");
				categ = sc.next();
				
				if (categ.equals("A") || categ.equals("L") || categ.equals("V")) {
					break;
				}
				
				else {
					System.out.println("ERRO!!! TENTE NOVAMENTE!");
				}
			}
			
			if (preco <= 20) {
				
				if (categ.equals("A")) {
					custoEst = 2;
				}
				
				else if (categ.equals("L")) {
					custoEst = 3;
				}
				
				else {
					custoEst = 4;
				}
			}
			
			else if (preco > 20 && preco <= 50) {
				
				if (refri.equals("S")) {
					custoEst = 6;
				}
				
				else {
					custoEst = 0;
				}
			}
			
			else {
				

				if (refri.equals("S")) {
					
					if (categ.equals("A")) {
						custoEst = 5;
					}
					
					else if (categ.equals("L")) {
						custoEst = 2;
					}
					
					else {
						custoEst = 4;
					}
				}
				
				else {
					if (categ.equals("A") || categ.equals("V")) {
						custoEst = 0;
					}
					
					else {
						custoEst = 1;
					}
				}
			}
		
		if (!categ.equals("A") && !refri.equals("S")) {
			imp = preco * 2 / 100;
		}
		
		else {
			imp = preco * 4 / 100;
		}
		
		precoFinal = preco + custoEst + imp;
		
		System.out.println("O custo de estoque é: " + custoEst);
		System.out.println("O imposto é: " + imp);
		System.out.println("O preço final é: " + precoFinal);
		
		if (precoFinal <= 20) {
			qtdB = qtdB + 1;
			System.out.println("Classificação Barato");
		}
		
		else if (precoFinal > 20 && precoFinal <= 100) {
			qtdN = qtdN + 1;
			System.out.println("Classificação Normal");
		}
		
		else {
			qtdC = qtdC + 1;
			System.out.println("Classificação Caro");
		}
		
		adicional = adicional + custoEst + imp;
		totImp = totImp + imp;
		
		if (i == 1) {
			maiorP = precoFinal;
			menorP = precoFinal;
		}
		
		else {
			if(precoFinal > maiorP) {
				maiorP = precoFinal;
			}
			
			if(precoFinal < menorP) {
				menorP = precoFinal;
			}
		}
		
		}
		
		adicional = adicional / 12;
		
		System.out.println("O custo de adicional é: " + adicional);
		System.out.println("O maior preço é: " + maiorP);
		System.out.println("O menor preço é: " + menorP);
		System.out.println("O total de imposto é: " + totImp);
		System.out.println("A quantidade de baratos: " + qtdB);
		System.out.println("A quantidade de Normais: " + qtdN);
		System.out.println("A quantidade de Caros: " + qtdC);
	}

}
