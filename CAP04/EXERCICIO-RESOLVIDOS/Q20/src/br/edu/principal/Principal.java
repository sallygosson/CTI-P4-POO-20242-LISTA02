package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod_prod;
        double peso_quilos;
        int cod_pais;
        double peso_gramas;
        double pre_total;
        double imposto;
        double valor_total;
        double pre_grama;

        System.out.print("Digite o código do produto entre 1 e 10: ");
        cod_prod = sc.nextInt();
        System.out.print("Digite o peso do produto em quilos: ");
        peso_quilos = sc.nextDouble();
        System.out.print("Digite o código do país de origem do produto entre 1 e 3: ");
        cod_pais = sc.nextInt();

        peso_gramas = peso_quilos * 1000;
        System.out.print("O peso do produto em gramas é: " + peso_gramas + " gramas.");

        if (cod_prod >= 1 && cod_prod <= 4) {
            pre_grama = 10;
        } else if (cod_prod >= 5 && cod_prod <= 7) {
            pre_grama = 25;
        } else if (cod_prod >= 8 && cod_prod <= 10) {
            pre_grama = 35;
        } else {
            pre_grama = 0;
        }

        pre_total = peso_gramas * pre_grama;
        System.out.print("O preço total do produto é: " + pre_total + " Reais.");

        if (cod_pais == 1) {
            imposto = 0;
        } else if (cod_pais == 2) {
            imposto = pre_total * (15.0 / 100);
        } else if (cod_pais == 3) {
            imposto = pre_total * (25.0 / 100);
        } else {
            imposto = 0;
        }

        System.out.print("O valor do imposto é: " + imposto + " Reais.");
        valor_total = pre_total + imposto;
        System.out.print("O valor total do produto com o imposto será de: " + valor_total + " Reais.");
    }
}
