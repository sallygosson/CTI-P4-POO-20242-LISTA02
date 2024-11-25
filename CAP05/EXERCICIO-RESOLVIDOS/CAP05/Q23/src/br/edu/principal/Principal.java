package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double sal, qtd, tipo, valor_kw, gasto, acresc;
        double total, tot_geral = 0, qtd_cons = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário mínimo: ");
        sal = sc.nextDouble();
        System.out.print("Digite a quantidade de quilowatts consumida: ");
        qtd = sc.nextDouble();

        valor_kw = sal / 8;

        while (qtd != 0) {
            gasto = qtd * valor_kw;

            System.out.print("Digite o tipo de consumidor (1, 2 ou 3): ");
            tipo = sc.nextDouble();

            if (tipo == 1) {
                acresc = gasto * 5 / 100;
            } else if (tipo == 2) {
                acresc = gasto * 10 / 100;
            } else if (tipo == 3) {
                acresc = gasto * 15 / 100;
            } else {
                acresc = 0;
                System.out.println("Tipo de consumidor inválido. Não será aplicado acréscimo.");
            }

            total = gasto + acresc;
            tot_geral += total;

            if (total >= 500 && total <= 1000) {
                qtd_cons++;
            }

            System.out.println("Gasto: " + gasto);
            System.out.println("Acréscimo: " + acresc);
            System.out.println("Total a pagar: " + total);

            System.out.print("Digite a próxima quantidade de quilowatts consumida (ou 0 para encerrar): ");
            qtd = sc.nextDouble();
        }

        System.out.println("Total geral arrecadado: " + tot_geral);
        System.out.println("Quantidade de consumidores com gasto entre 500 e 1000: " + qtd_cons);
    }
}