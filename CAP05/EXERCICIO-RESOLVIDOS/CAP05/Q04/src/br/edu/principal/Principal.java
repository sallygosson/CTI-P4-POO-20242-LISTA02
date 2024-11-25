package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont;
        int cod;
        int num_vei;
        int num_acid;
        int maior = 0;
        int cid_maior = 0;
        int menor = 0;
        int cid_menor = 0;
        double media_vei;
        double soma_vei = 0;
        double media_acid;
        double soma_acid = 0;
        double cont_acid = 0;

        for (cont = 1; cont <= 5; cont++) {
            System.out.print("Digite o código da cidade: ");
            cod = sc.nextInt();
            System.out.print("Digite o número de veículos de passeio: ");
            num_vei = sc.nextInt();
            System.out.print("Digite o número de acidentes de trânsito: ");
            num_acid = sc.nextInt();

            if (cont == 1) {
                maior = num_acid;
                cid_maior = cod;
                menor = num_acid;
                cid_menor = cod;
            } else {
                if (num_acid > maior) {
                    maior = num_acid;
                    cid_maior = cod;
                } else if (num_acid < menor) {
                    menor = num_acid;
                    cid_menor = cod;
                }
            }

            soma_vei = soma_vei + num_vei;

            if (num_vei < 2000) {
                soma_acid = soma_acid + num_acid;
                cont_acid++;
            }
        }

        System.out.println("O maior índice de acidentes é de: " + maior + " da cidade: " + cid_maior);
        System.out.println("O menor índice de acidentes é de: " + menor + " da cidade: " + cid_menor);

        media_vei = soma_vei / 5;
        System.out.println("A média de veículos nas cinco cidades é de: " + media_vei + " veículos.");

        if (cont_acid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
        } else {
            media_acid = soma_acid / cont_acid;
            System.out.println("A média de acidentes de carros com menos de 2000 veículos de passeio é de: " + media_acid + " acidentes.");
        }
    }
}