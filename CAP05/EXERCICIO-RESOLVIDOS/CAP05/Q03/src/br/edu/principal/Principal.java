package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n; 
        int num; 
        int i; 
        int j; 
        double fat;

        System.out.print("Digite um número inteiro positivo: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print("Digite um número para calcular o fatorial: ");
            num = sc.nextInt();
            fat = 1;
            for (j = 1; j <= num; j++) {
                fat = fat * j;
            }
            System.out.print("O fatorial do número " + num + " é: " + fat);
        }
    }
}
