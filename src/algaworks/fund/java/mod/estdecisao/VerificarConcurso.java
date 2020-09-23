package algaworks.fund.java.mod.estdecisao;

import java.util.Scanner;

public class VerificarConcurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		final Double notaMinima = 60.0;
		
		final Double mediaMinima = 150.0;
		
		System.out.printf("Digite a nota da prova de português: ");
		Double notaPort = sc.nextDouble();
		
		System.out.printf("Digite a nota da prova de matemática: ");
		Double notaMat = sc.nextDouble();
		
		Double media = notaMat + notaPort;
		
		Boolean validarNotaMinima = notaPort < notaMinima || notaMat < notaMinima;
		Boolean validarMediaMinima = mediaMinima > media;
		
		if (validarNotaMinima) {
			System.out.println("Reprovado.");
		} else if (validarMediaMinima) {
			System.out.println("Reprovado.");
		} else {
			System.out.println("Aprovado.");
		}
		
		
	}

}
