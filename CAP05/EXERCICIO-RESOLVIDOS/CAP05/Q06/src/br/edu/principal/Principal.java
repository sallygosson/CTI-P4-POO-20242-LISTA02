package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String turno, categoria;
		Double salMin, salInicial, aux, salFinal, nHorasT, valorHT;
		int cont, codigo; 
		
		salMin = 450.0;
		cont = 1;
		
		while (cont <= 10) {
			
			System.out.print("Digite o seu código de funcionário: ");
			codigo = sc.nextInt();
			
			System.out.print("Digite o seu número de horas trabalhadas: ");
			nHorasT = sc.nextDouble();
			
			while (true){
				
			System.out.print("Digite o seu turno [M (Matutino) / V (Vespertino)/ N (Noturno) ]: ");
			turno = sc.next();
			
			if (turno.equals("M") || turno.equals("V") || turno.equals("N")) { 
				//  .equals() compara o conteúdo das strings, ou seja, verifica se elas têm o mesmo valor.
				break;
			}
			
			else {
				System.out.println("Erro! Tente novamente!");
			}
			
			}
			
			while (true){
				
			System.out.print("Digite sua categoria [G (Gerente) / O (Operário) ]: ");
			categoria = sc.next();
			
			if (categoria.equals("G") || categoria.equals("O")) {
				break;
			}
			
			else {
				System.out.print("Erro! Tente novamente!");
			}
			
			
			}
			
			
			
			if (categoria.equals("G")){
				
				if (turno.equals("N")) {
					valorHT = salMin * 0.18;
				}
				
				else {
					valorHT = salMin * 0.15;
				}
			}
			
			else {
				if(turno.equals("N")) {
					valorHT = salMin * 0.13;
				}
				
				else {
					valorHT = salMin * 0.10;
				}
			}
			
			
			
			salInicial = nHorasT * valorHT;
			
			
			if (salInicial <= 300) {
				aux = salInicial * 0.20;
			}
			
			else if (salInicial < 600) {
				aux = salInicial * 0.15;
			}
			
			else {
				aux = salInicial * 0.05;
			}
			
			salFinal = salInicial + aux;
			
			System.out.println("Trabalhador(a): " + codigo + "\n" + "Número de Horas Trabalhadas: " + nHorasT + "\n" + "Valor das Horas Trabalhadas: " + valorHT + "\n" + "Salário Inicial: " + salInicial + "\n" + "Auxílio Alimentação: " + aux + "\n" + "Salário Final: " + salFinal + "\n");
			
			cont = cont + 1;
		}
		

	}
	
	
	
	
}
