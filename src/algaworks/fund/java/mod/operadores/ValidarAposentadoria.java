package algaworks.fund.java.mod.operadores;

import java.util.Scanner;

public class ValidarAposentadoria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final Integer idadeMinima = 55;
		final Integer contribuicaoMinima = 25;
		
		System.out.printf("Digite sua idade: ");
		Integer idade = sc.nextInt();
		
		System.out.printf("Digite quantos anos de contribuição: ");
		Integer qtdTempo = sc.nextInt();
		
		Boolean validar = idade>= idadeMinima && qtdTempo>=contribuicaoMinima;
		
		if (validar) {
			System.out.println("Já é possível dar entrada na aposentadoria.");
		} else {
			System.out.println("Ainda não é possível dar entrada na aposentadoria.");
		}
	}

}
