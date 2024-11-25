package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numOp, numPeças, cont, totPecas, contM, contF, numMaior;
		double totFolha, salarioOp, mediaM, mediaF, salarioMaior ;
		String sexo;
		
		numMaior = 0;
		salarioMaior = 0;
		totFolha = 0;
		totPecas = 0;
		mediaM = 0;
		mediaF = 0;
		contM = 0;
		contF = 0;
		
		for (cont = 1; cont <= 15; cont ++) {
			
			System.out.print("Digite o número do " + cont + "° operário: ");
			numOp = sc.nextInt();
			
			while (true) {
				System.out.print("Digite o sexo do " + cont + "° operário [M (Masculino) / F (Feminino): ");
				sexo = sc.next();
				
				if (sexo.equals("M") || sexo.equals("F")) {
					break;
				}
				
				else {
					System.out.println("ERRO!!! TENTE NOVAMENTE!");
				}
			}
			
			System.out.print("Digite o número de peças fabricadas pelo " + cont + "° operário: ");
			numPeças = sc.nextInt();
			
			if (numPeças <= 30) {
				salarioOp = 450;
			}
			
			else if (numPeças > 30 && numPeças <= 50) {
				salarioOp = 450 + ((numPeças - 30) * 0.03 * 450); 
			}
			
			else {
				salarioOp = 450 + ((numPeças - 30) * 0.05 * 450); 
			}
			
			System.out.println("O operário número: " + numOp + ", recebe salário = " + salarioOp);
			
			totFolha = totFolha + salarioOp;
			totPecas = totPecas + numPeças;
			
			if (sexo.equals("M")) {
				mediaM = mediaM + numPeças;
				contM ++;
			}
			
			else {
				mediaF = mediaF + numPeças;
				contF ++;
			}
			
			if (cont == 1) {
				salarioMaior = salarioOp;
				numMaior = numOp;
			}
			
			else {
				if (salarioOp > salarioMaior) {
					salarioMaior = salarioOp;
					numMaior = numOp;
				}
			}
		}
		
		System.out.println("O total da folha de pagamento = " + totFolha);
		System.out.println("O total de peças fabricadas no mês = " + totPecas);
		
		if (contM == 0) {
			System.out.println("Não possui homens na Fabrica.");
		}
		
		else {
			mediaM = mediaM / contM;
			System.out.println("A média de peças fabricadas por homens = " + mediaM);
		}
		
		if (contF == 0) {
			System.out.println("Não possui mulheres na Fabrica.");
		}
		
		else {
			mediaF = mediaF / contF;
			System.out.println("A média de peças fabricadas por mulheres = " + mediaF);
		}
		
		System.out.println("O número do operário com o maior saláeio é: " + numMaior);
		
	}

}