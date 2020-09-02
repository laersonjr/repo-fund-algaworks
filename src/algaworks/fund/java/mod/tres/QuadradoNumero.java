package algaworks.fund.java.mod.tres;

import java.util.Scanner;

public class QuadradoNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de um número: ");
		
		Double numero = sc.nextDouble();
		
		Double quadrado = numero*numero;
		
		System.out.printf("O valor quadrado do número digitado é %.2f", quadrado);

	}

}
