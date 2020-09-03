package algaworks.fund.java.mod.quatro;

import java.util.Scanner;

public class GastosFamiliar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Double valorTotal = 0.0;
		
		System.out.printf("Valor da conta de luz: ");
		valorTotal += sc.nextDouble();
		
		System.out.printf("Valor da conta de água: ");
		valorTotal += sc.nextDouble();
		
		System.out.printf("Valor da conta de telefone: ");
		valorTotal += sc.nextDouble();
		
		System.out.printf("Valor da escola dos filhos: ");
		valorTotal += sc.nextDouble();
		
		System.out.printf("Valor da fatura do cartão: ");
		valorTotal += sc.nextDouble();
		
		System.out.printf("Gastos com supermecados: ");
		valorTotal += sc.nextDouble();
		
		System.out.println("Gastos totais: R$" + valorTotal);

	}

}
