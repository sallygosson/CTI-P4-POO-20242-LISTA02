package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sal_base;
        int tempo;
        double imposto;
        double grat;
        double sal_liq;

        System.out.print("Digite o salário base: ");
        sal_base = sc.nextDouble();

        System.out.print("Digite o tempo de serviço: ");
        tempo = sc.nextInt();

        if (sal_base < 200) {
            imposto = 0;
        } else if (sal_base <= 450) {
            imposto = (3 / 100.0) * sal_base;  
        } else if (sal_base < 700) {
            imposto = (8 / 100.0) * sal_base;  
        } else {
            imposto = (12 / 100.0) * sal_base;  
        }

        System.out.print("O valor do imposto é de: " + imposto + " Reais.");

        
        if (sal_base > 500) {
            if (tempo <= 3) {
                grat = 20;
            } else {
                grat = 30;
            }
        } else {
            if (tempo <= 3) {
                grat = 23;
            } else if (tempo < 6) {
                grat = 35;
            } else {
                grat = 33;
            }
        }

        System.out.print("O valor da gratificação é de: " + grat + " Reais.");

        sal_liq = sal_base - imposto + grat;
        System.out.print("O valor do salário líquido é de: " + sal_liq + " Reais.");

        if (sal_liq <= 350) {
            System.out.print(" Classificação A.");
        } else if (sal_liq < 600) {
            System.out.print(" Classificação B.");
        } else {
            System.out.print(" Classificação C.");
        }
    }
}

