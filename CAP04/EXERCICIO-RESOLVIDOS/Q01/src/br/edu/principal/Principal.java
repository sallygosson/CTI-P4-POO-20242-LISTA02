package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tl; double as; double ef; double med;
		
		
		System.out.print("Insira a nota do seu trabalho de laboratório: ");
		tl = sc.nextDouble();
		
		System.out.print("Insira a nota da sua avaliação semestral: ");
		as = sc.nextDouble();
		
		System.out.print("Insira a nota do seu exame final: ");
		ef = sc.nextDouble();
		
		med = (tl * 2 + as * 3 + ef * 5) / 10;
		
		System.out.println("A sua média ponderada foi: " + med );
	
		if (med >= 8 && med <= 10) {
			
			System.out.println("A sua nota obteve o conceito A. ");
			
		}
		
		else if(med >= 7 && med < 8) {
			
			System.out.println("A sua nota obteve o conceito B.");
		}
		
		else if(med >= 6 && med < 7) {
			
			System.out.println("A sua nota obteve o conceito C.");
		}
		
		else if(med >= 5 && med < 6) {
			
			System.out.println("A sua nota obteve o conceito D.");
		}
		
		else {
		
			System.out.println("A sua nota obteve o conceito D.");
		}
		
		


	}

}
