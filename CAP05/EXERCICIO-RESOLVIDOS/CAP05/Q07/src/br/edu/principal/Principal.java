package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int cont, n1, n2, res;
		
		n1 = 0;
		n2 = 1;
		cont = 3;
		
		System.out.print(n1 + " " + n2);
		while(cont <= 8) {
			
			res = n1 + n2;
			System.out.print(" " + res + " ");
			
			n1 = n2;
			n2 = res;
			
			cont ++;
			
		}

	}

}