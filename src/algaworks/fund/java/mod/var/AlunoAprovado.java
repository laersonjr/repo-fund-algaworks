package algaworks.fund.java.mod.var;

import java.util.Scanner;

public class AlunoAprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Double nota = null;
		Boolean validar = null;
		final Integer notaMinima = 70;

		System.out.printf("Digite o valor da nota final do aluno: ");
		nota = sc.nextDouble();
		validar = nota > notaMinima;

		if (validar == true) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}
	}

}
