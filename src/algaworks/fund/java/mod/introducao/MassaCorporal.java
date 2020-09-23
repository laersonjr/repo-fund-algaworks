package algaworks.fund.java.mod.introducao;

import java.util.Scanner;

public class MassaCorporal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double peso;
		Double altura;
		Double imc;

		System.out.println("Vamos calcular o índice de sua massa corporal.");

		System.out.print("Digite o valor de seu peso: ");
		peso = sc.nextDouble();

		System.out.print("Digite sua altura: ");
		altura = sc.nextDouble();

		imc = (peso / (altura * altura));

		System.out.printf("Seu IMC é %.2f", imc);

	}

}
