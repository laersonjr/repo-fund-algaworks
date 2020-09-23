package algaworks.fund.java.mod.metodos;

import java.util.Scanner;

public class CalculadoraMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		informarNumero();
		Double valor1 = sc.nextDouble();
		
		informarNumero();
		Double valor2 = sc.nextDouble();
		
		opcoes();
		
		Character opcao = sc.next().charAt(0);
		
		resultado(opcao, valor1, valor2);
		
	}
	
	public static void informarNumero() {
		System.out.printf("Informe um número: ");
	}
	
	public static void opcoes() {
		System.out.println("Digite + para adição, - para subtração, * para multiplicação"
				+ " e / para divisão");
	}
	
	public static Double soma(Double num1, Double num2) {
		return num1 + num2;
	}
	
	public static Double subtracao(Double num1, Double num2) {
		return num1 - num2;
	}
	
	public static Double multiplicacao(Double num1, Double num2) {
		return num1 * num2;
	}
	
	public static Double divisao(Double num1, Double num2) {
		return num1 / num2;
	}
	
	public static void resultado(Character opcao, Double valor1, Double valor2) {
		
		switch (opcao) {
		case '+':
			System.out.println(soma(valor1, valor2));
			break;
			
		case '-':
			System.out.println(subtracao(valor1, valor2));
			break;
			
		case '*':
			System.out.println(multiplicacao(valor1, valor2));
			break;
		case '/':
			System.out.println(divisao(valor1, valor2));
			break;
		default:
			System.err.println("Opção inválida!");
			break;
		}
		
	}

}
