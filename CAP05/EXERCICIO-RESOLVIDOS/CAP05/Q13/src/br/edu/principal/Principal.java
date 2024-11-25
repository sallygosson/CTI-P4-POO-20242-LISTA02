package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sexo;
		int i, numCri, meses, totF, totM, tot24 ;
		double porcF, porcM, porc24;
		
		System.out.print("Digite o número de crianças nascidas nesse período: ");
		numCri = sc.nextInt();
		
		totF = 0;
		totM = 0;
		tot24 = 0;
		
		for (i = 1; i <= numCri; i ++) {
			
			while (true) {
				System.out.print("Digite o sexo da " + i + "ª criança [M (Masculino) / F (Feminino): ");
				sexo = sc.next();
				
				if (sexo.equals("M") || sexo.equals("F")) {
					break;
				}
				
				else {
					System.out.println("ERRO!!! TENTE NOVAMENTE!");
				}
				
			}
			
			System.out.print("Digite o tempo de vida da " + i + "ª criança: ");
			meses = sc.nextInt();
			
			if (sexo.equals("M")) {
				totM ++;
			}
			
			else {
				totF ++;
			}
			
			if(meses <= 24) {
				tot24 ++;
			}
			
		}
		
		if (numCri == 0) {
			System.out.println("Nenhuma crinaça digitada!");
		}
		
		else {
			porcM = totM * 100 / numCri;
			porcF = totF * 100 / numCri;
			porc24 = tot24 * 100 / numCri;
			
			System.out.println("Percentual de crianças do sexo feminino mortas: " + porcF + "%");
			System.out.println("Percentual de crianças do sexo masculino mortas: " + porcM + "%");
			System.out.println("Percentual de crianças com 24 meses ou menos mortas: " + porc24 + "%");
		}
			
		
		

	}

}
