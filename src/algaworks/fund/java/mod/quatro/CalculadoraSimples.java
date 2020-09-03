package algaworks.fund.java.mod.quatro;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora simples.");
		
		System.out.printf("%nDigite o primeiro número: ");
		Double num1 = sc.nextDouble();
		
		System.out.printf("Digite o segundo número: ");
		Double num2 = sc.nextDouble();
		
		System.out.printf("Digite 1 para +, 2 para -, 3 para * e 4 para / :");
		Integer opcao = sc.nextInt();
		
		Double resultado = null;
		
		switch (opcao) {
		case 1:
			resultado = num1 + num2;
			System.out.printf("%.1f + %.1f = %.1f", num1, num2, resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.printf("%.1f - %.1f = %.1f", num1, num2, resultado);
			break;
		case 3:
			resultado = num1 * num2;
			System.out.printf("%.1f * %.1f = %.1f", num1, num2, resultado);
			break;
		case 4:
			resultado = num1 / num2;
			System.out.printf("%.1f / %.1f = %.1f", num1, num2, resultado);
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

	}

}
