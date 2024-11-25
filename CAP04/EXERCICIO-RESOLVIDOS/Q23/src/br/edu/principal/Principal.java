package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sal_min;
        double nht;
        double coeficiente;
        double sal_bruto;
        double imposto;
        double grat;
        double auxilio;
        double sal_liq;
        String turno;
        String categoria;

        System.out.print("Digite o valor do salário mínimo: ");
        sal_min = sc.nextDouble();

        System.out.print("Digite o turno de trabalho (m/v/n): ");
        turno = sc.next();

        System.out.print("Digite a categoria, Operário(o) ou Gerente(g): ");
        categoria = sc.next();

        System.out.print("Digite o número de horas trabalhadas: ");
        nht = sc.nextDouble();

        if(turno.equals("m")) {
            coeficiente = (10 / 100.0) * sal_min;
        } else if(turno.equals("v")) {
            coeficiente = (15 / 100.0) * sal_min;
        } else {
            coeficiente = (12 / 100.0) * sal_min;
        }
        System.out.print("O valor do coeficiente é de: " + coeficiente + ".");

        sal_bruto = nht * coeficiente;
        System.out.print("O valor do salário bruto é de: " + sal_bruto + " Reais.");

        if(categoria.equals("o")) {
            if(sal_bruto >= 300) {
                imposto = (5 / 100.0) * sal_bruto;
            } else {
                imposto = (3 / 100.0) * sal_bruto;
            }
        } else {
            if(sal_bruto >= 400) {
                imposto = (6 / 100.0) * sal_bruto;
            } else {
                imposto = (4 / 100.0) * sal_bruto;
            }
        }
        System.out.print("O valor do imposto é de: " + imposto + " Reais.");

        if(turno.equals("n") && nht > 80) {
            grat = 50;
        } else {
            grat = 30;
        }
        System.out.print("O valor da gratificação é de: " + grat + " Reais.");

        if(categoria.equals("o") || coeficiente <= 25) {
            auxilio = (1 / 3.0) * sal_bruto;
        } else {
            auxilio = (1 / 2.0) * sal_bruto;
        }
        System.out.print("O valor do auxílio é de: " + auxilio + " Reais.");

        sal_liq = sal_bruto - imposto + grat + auxilio;
        System.out.print("O valor do salário líquido é de: " + sal_liq + " Reais.");

        if(sal_liq < 350) {
            System.out.print(" Mal remunerado.");
        } else if(sal_liq >= 350 && sal_liq <= 600) {
            System.out.print(" Normal.");
        } else {
            System.out.print(" Bem remunerado.");
        }
    }
}
