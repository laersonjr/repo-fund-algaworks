package algaworks.fund.java.mod.quatro;

import java.util.Scanner;

public class DescontoFrete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor do produto: ");
		Double produto = sc.nextDouble();
		
		Integer frete = 15;
		
		Double valorFinal = null;
		
		if (produto < 100) {
			System.out.println("Valor do produto: R$" + produto);
			System.out.println("Valor do frete = R$" + frete);
			valorFinal = produto + frete;
			System.out.println("Valor final da compra = R$" + valorFinal);
		} else {
			System.out.println("Valor do produto: R$" + produto);
			frete = 0;
			System.out.println("Valor do frete = R$" + frete);
			valorFinal = produto + frete;
			System.out.println("Valor final da compra = R$" + valorFinal);
		}

	}

}
