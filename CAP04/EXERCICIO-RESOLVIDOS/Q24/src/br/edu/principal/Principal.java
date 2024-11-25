package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pre;
        double valor_adic;
        double imposto;
        double pre_custo;
        double desconto;
        double novo_pre;
        String tipo;
        String refrig;

        System.out.print("Digite o preço do produto: ");
        pre = sc.nextDouble();

        System.out.print("Digite o tipo do produto, alimentação(a), limpeza(l), vestuário(v): ");
        tipo = sc.next();

        System.out.print("Digite a refrigeração, necessita de refrigeração(s), não necessita de refrigeração(n): ");
        refrig = sc.next();

        if(refrig.equals("n")) {
            if(tipo.equals("a")) {
                if(pre < 15) {
                    valor_adic = 2;
                } else {
                    valor_adic = 5;
                }
            } else if(tipo.equals("l")) {
                if(pre < 10) {
                    valor_adic = 1.50;
                } else {
                    valor_adic = 2.50;
                }
            } else if(tipo.equals("v")) {
                if(pre < 30) {
                    valor_adic = 3;
                } else {
                    valor_adic = 2.5;
                }
            } else {
                valor_adic = 0;
            }
        } else {
            if(tipo.equals("a")) {
                valor_adic = 8;
            } else if(tipo.equals("l")) {
                valor_adic = 0;
            } else if(tipo.equals("v")) {
                valor_adic = 0;
            } else {
                valor_adic = 0;
            }
        }

        System.out.print("O valor adicional é de: " + valor_adic + " Reais.");

        if(pre < 25) {
            imposto = (5 / 100.0) * pre;
        } else {
            imposto = (8 / 100.0) * pre;
        }

        System.out.print("O valor do imposto é de: " + imposto + " Reais.");

        pre_custo = pre + imposto;
        System.out.print("O preço de custo é de: " + pre_custo + " Reais.");

        if(!tipo.equals("a") && !refrig.equals("s")) {
            desconto = (3 / 100.0) * pre_custo;
        } else {
            desconto = 0;
        }

        System.out.print("O valor do desconto é de: " + desconto + " Reais.");

        novo_pre = pre_custo + valor_adic - desconto;
        System.out.print("O valor do novo preço é de: " + novo_pre + " Reais.");

        if(novo_pre <= 50) {
            System.out.print(" Barato.");
        } else if(novo_pre < 100) {
            System.out.print(" Normal.");
        } else {
            System.out.print(" Caro.");
        }
    }
}
