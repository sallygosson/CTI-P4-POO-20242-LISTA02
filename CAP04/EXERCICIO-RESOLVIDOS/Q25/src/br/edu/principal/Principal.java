package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angulo;
        int voltas;

        System.out.print("Digite a medida do ângulo em graus: ");
        angulo = sc.nextDouble();

        if(angulo > 360 || angulo < -360) {
            voltas = (int) (angulo / 360);
            angulo = angulo % 360; 
        } else {
            voltas = 0; 
        }

        if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360 || angulo == -90 
            || angulo == -180 || angulo == -270 || angulo == -360) {
            System.out.print("Está em cima de algum dos eixos.");
        } else if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
            System.out.print("1° Quadrante.");
        } else if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
            System.out.print("2° Quadrante.");
        } else if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
            System.out.print("3° Quadrante.");
        } else if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
            System.out.print("4° Quadrante.");
        }

        System.out.print(" O número de voltas é de: " + voltas + ". Volta(s) no sentido: ");
        if (angulo < 0) {
            System.out.print("Horário.");
        } else {
            System.out.print("Anti-horário.");
        }
    }
}
