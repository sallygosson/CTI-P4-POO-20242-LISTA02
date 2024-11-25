package br.edu.principal;

import java.util.Scanner;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fim;
        int i;
        int j;
        int x;
        int expoente;
        int num_termos;
        double den = 1;
        int denominador = 1;
        double fat;
        double s = 0;

        System.out.print("Digite o número de termos: ");
        num_termos = sc.nextInt();

        System.out.print("Digite um valor para x: ");
        x = sc.nextInt();

        for (i = 1; i <= num_termos; i++) {
            fim = denominador;
            fat = 1;

            for (j = 1; j <= fim; j++) {
                fat = fat * j;
            }

            expoente = i + 1;
            
            if (expoente % 2 == 0) {
                s = s - Math.pow(x, expoente) / fat;
            } else {
                s = s + Math.pow(x, expoente) / fat;
            }

            if (denominador == 4) {
                den = -1;
            } else if (denominador == 1) {
                den = 1;
            }

            if (den == 1) {
                denominador = denominador + 1;
            } else {
                denominador = denominador - 1;
            }
        }

        System.out.print("O valor da série é: " + s);
    }
}