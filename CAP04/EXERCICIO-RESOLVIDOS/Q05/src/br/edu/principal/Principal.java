package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1; double n2; double n3; double n4;
		
		System.out.print("Digite o primeiro número em ordem crescente: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número em ordem crescente: ");
		n2 = sc.nextDouble();
		
		System.out.print("Digite o terceiro número em ordem crescente: ");
		n3 = sc.nextDouble();
		
		System.out.print("Digite um número fora de ordem: ");
		n4 = sc.nextDouble();
		
		if(n4>n3) {
			System.out.print("A ordem decrescente é: " + n4 +" - "+n3+" - "+n2+" - "+n1);
			
		}
		
		else if ((n4>n2) && (n4<n3)) {
			System.out.print("A ordem decrescente é: " + n3 +" - "+n4+" - "+n2+" - "+n1);
			
		}
		else if ((n4 > n1) && (n4 < n2) && (n4 < n3)) {
			System.out.print("A ordem decrescente é: " + n3 +" - "+n2+" - "+n4+" - "+n1);
		}
		else {
			System.out.print("A ordem decrescente é: " + n3 +" - "+n2+" - "+n1+" - "+n4);
 
		}
		
	}

}
