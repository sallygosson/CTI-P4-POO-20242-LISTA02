package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano_atual; 
        double salario = 1000; 
        double novo_salario;
        double percentual = 1.5 / 100; 

        System.out.print("Digite o ano atual: ");
        ano_atual = sc.nextInt();

        novo_salario = salario + (percentual * salario);

        for (int i = 2007; i <= ano_atual; i++) {
            percentual = 2 * percentual; 
            novo_salario = novo_salario + (percentual * novo_salario);
        }

        System.out.print("O valor do novo salário é de: " + novo_salario);
    }
}