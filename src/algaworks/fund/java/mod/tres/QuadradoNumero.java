package algaworks.fund.java.mod.tres;

import java.util.Scanner;

public class QuadradoNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de um n�mero: ");
		
		Double numero = sc.nextDouble();
		
		Double quadrado = numero*numero;
		
		System.out.printf("O valor quadrado do n�mero digitado � %.2f", quadrado);

	}

}
