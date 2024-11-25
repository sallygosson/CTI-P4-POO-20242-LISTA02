package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();
        
        if (a == 0) {
            System.out.println("Estes valores não formam uma equação de segundo grau.");
        } else {
            double delta = (b * b) - (4 * a * c);
            
            if (delta < 0) {
                System.out.println("Não existe raiz real.");
            } else if (delta == 0) {
                double x1 = -b / (2 * a);
                System.out.println("Existe uma raiz real: " + x1);
            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Existem duas raízes reais: " + x1 + " e " + x2);
            }
        }
    }
}
