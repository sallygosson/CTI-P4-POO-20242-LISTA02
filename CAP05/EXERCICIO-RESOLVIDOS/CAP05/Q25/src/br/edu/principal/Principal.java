package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double preco, imp, transp = 0, seguro, finalValor, totalImp = 0;
        int origem;
        String meioT, carga;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço: ");
        preco = sc.nextDouble();

        while (preco > 0) {
            System.out.print("Digite a origem (1, 2 ou 3): ");
            origem = sc.nextInt();

            System.out.print("Digite o meio de transporte (A - Aéreo, T - Terrestre): ");
            meioT = sc.next();

            System.out.print("Carga especial? (S - Sim, N - Não): ");
            carga = sc.next();

            if (preco <= 100) {
                imp = preco * 5 / 100;
            } else {
                imp = preco * 10 / 100;
            }

            if (carga.equalsIgnoreCase("S")) {
                if (origem == 1) {
                    transp = 50;
                } else if (origem == 2) {
                    transp = 21;
                } else if (origem == 3) {
                    transp = 24;
                }
            } else if (carga.equalsIgnoreCase("N")) {
                if (origem == 1) {
                    transp = 12;
                } else if (origem == 2) {
                    transp = 21;
                } else if (origem == 3) {
                    transp = 60;
                }
            }

            if (origem == 2 || meioT.equalsIgnoreCase("A")) {
                seguro = preco / 2;
            } else {
                seguro = 0;
            }

            finalValor = preco + imp + transp + seguro;
            totalImp += imp;

            System.out.println("Imposto: " + imp);
            System.out.println("Transporte: " + transp);
            System.out.println("Seguro: " + seguro);
            System.out.println("Valor final: " + finalValor);

            System.out.print("Digite o próximo preço (ou 0 para encerrar): ");
            preco = sc.nextDouble();
        }

        System.out.println("Total de impostos arrecadados: " + totalImp);
    }
}