package algaworks.fund.java.mod.estdecisao;

import java.util.Scanner;

public class BonusSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor da meta do faturamento anual: ");
		Double metaFaturamentoAnual = sc.nextDouble();
		
		System.out.printf("Digite o valor atingido pela empresa no ano: ");
		Double valorAtingidoAnual = sc.nextDouble();
		
		System.out.printf("Digite o valor da media salaial anual do funcionário: ");
		Double mediaSalarial = sc.nextDouble();
		
		Double bonus = null;
		
		if (valorAtingidoAnual >= metaFaturamentoAnual) {
			bonus = mediaSalarial;
			
			System.out.println("Bônus recebido = " + bonus);
		} else if (valorAtingidoAnual < metaFaturamentoAnual && 
				valorAtingidoAnual >= (metaFaturamentoAnual*0.8)) {
			bonus = mediaSalarial*0.8;
			
			System.out.println("Bônus recebido = " + bonus);
		} else {
			bonus = 0.0;
			
			System.out.println("Bônus recebido = " + bonus);
		}

	}

}
