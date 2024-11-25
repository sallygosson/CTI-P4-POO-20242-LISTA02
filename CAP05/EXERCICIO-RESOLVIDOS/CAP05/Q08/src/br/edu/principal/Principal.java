package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, nTermos, n1, n2, n3;
		
		n1 = 2;
		n2 = 7;
		n3 = 3;
		
		System.out.print("Digite o número de termos: ");
		nTermos = sc.nextInt();
		
		System.out.print(n1 + " " + n2 + " " + n3);
		
		
		for (i = 4; i != nTermos; i++) {
			
			n1 = n1 * 2;
			System.out.print(" " + n1);
			
			n2 = n2 * 3;
			System.out.print(" " + n2);
			
			n3 = n3 * 4;
			System.out.print(" " + n3);
				
		}
		
		

		
		

	}

}