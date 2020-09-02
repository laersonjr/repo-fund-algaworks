package algaworks.fund.java.mod.tres;

import java.util.Scanner;

public class DescontoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Double valor = null;
		Integer quantidade = null;
		Double subtotal = null;
		Double valorFinal = null;
		Double desconto = 0.1;

		System.out.print("Digite o valor do produto: ");
		valor = sc.nextDouble();

		System.out.print("Digite a quantidade: ");
		quantidade = sc.nextInt();

		subtotal = valor * quantidade;

		System.out.printf("Valor: %.2f%n", valor);
		System.out.printf("Quantidade: %d%n", quantidade);
		System.out.printf("Subtotal: %.2f%n", subtotal);

		if (quantidade < 10) {
			valorFinal = subtotal;
			System.out.printf("Valor final: %.2f", valorFinal);
		}

		if (quantidade >= 10) {
			valorFinal = subtotal - (subtotal * desconto);
			System.out.printf("Valor final: %.2f", valorFinal);
		}

	}

}
