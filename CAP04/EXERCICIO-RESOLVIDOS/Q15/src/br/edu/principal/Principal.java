package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double sal_min = sc.nextDouble();

        System.out.print("Digite o número de horas trabalhadas: ");
        double nht = sc.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        double ndep = sc.nextDouble();

        System.out.print("Digite o número de horas extras trabalhadas: ");
        double nhet = sc.nextDouble();

       
        double vh = (1.0 / 5.0) * sal_min; 
        double smes = nht * vh;           
        double vdep = 32 * ndep;          
        double vhe = nhet * (vh + (vh * 0.5));
        double sbruto = smes + vdep + vhe; 

        double imp;
        if (sbruto < 200) {
            imp = 0;
        } else if (sbruto <= 500) {
            imp = sbruto * 0.1;
        } else {
            imp = sbruto * 0.2;
        }

        double sliq = sbruto - imp;

        double grat;
        if (sliq <= 350) {
            grat = 100;
        } else {
            grat = 50;
        }

        double sal_receber = sliq + grat;

        System.out.println("O salário a receber é: " + sal_receber);

}
}
